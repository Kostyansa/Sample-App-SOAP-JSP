package org.example.shop.service.Impl;

import org.example.shop.entity.Bundle;
import org.example.shop.entity.Item;
import org.example.shop.exception.ItemNotFoundException;
import org.example.shop.repository.BundleRepository;
import org.example.shop.repository.dto.BundleDB;
import org.example.shop.service.BundleService;
import org.example.shop.service.ItemService;
import org.example.shop.service.mapper.BundleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@Service
public class BundleServiceImpl implements BundleService {

    private ItemService itemService;

    private BundleRepository bundleRepository;

    private BundleMapper bundleMapper;

    @Autowired
    public BundleServiceImpl(ItemService itemService, BundleRepository bundleRepository, BundleMapper bundleMapper) {
        this.itemService = itemService;
        this.bundleRepository = bundleRepository;
        this.bundleMapper = bundleMapper;
    }


    @Override
    public Bundle find(Long id) {
        CompletableFuture<Optional<BundleDB>> bundleDB = CompletableFuture.supplyAsync(
                () -> bundleRepository.read(id)
        );
        CompletableFuture<List<Item>> items = itemService.findByBundleId(id);
        try {
            return bundleMapper.toBundle(
                    bundleDB.get(3, TimeUnit.SECONDS)
                            .orElseThrow(ItemNotFoundException::new),
                    items.get()
            );
        } catch (InterruptedException | ExecutionException e) {
            throw new ItemNotFoundException("Internal Server Error");
        } catch (TimeoutException e) {
            throw new ItemNotFoundException("Server is overloaded");
        }
    }

    @Override
    public List<Bundle> find(Long limit, Long offset) {

        CompletableFuture<List<BundleDB>> bundlesDB = CompletableFuture.supplyAsync(
                () -> bundleRepository.read(limit, offset)
        );
        List<Bundle> bundles = new ArrayList<>();
        try {
            //Did not use stream because exceptions in Lambdas
            for (BundleDB bundleDB : bundlesDB.get()) {
                CompletableFuture<List<Item>> items = itemService.findByBundleId(bundleDB.getId());
                bundles.add(bundleMapper.toBundle(
                        bundleDB,
                        items.get(3, TimeUnit.SECONDS)
                ));
            }
        } catch (InterruptedException | ExecutionException e) {
            throw new ItemNotFoundException("Internal Server Error");
        } catch (TimeoutException e) {
            throw new ItemNotFoundException("Server is overloaded");
        }
        return bundles;
    }
}
