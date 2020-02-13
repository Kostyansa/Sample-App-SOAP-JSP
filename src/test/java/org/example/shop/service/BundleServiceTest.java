package org.example.shop.service;

import org.example.shop.entity.Bundle;
import org.example.shop.entity.Item;
import org.example.shop.repository.BundleRepository;
import org.example.shop.repository.ItemRepository;
import org.example.shop.repository.dto.BundleDB;
import org.example.shop.service.mapper.BundleMapper;
import org.example.shop.service.mapper.ItemMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.CacheManager;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootTest
public class BundleServiceTest {

    @Autowired
    BundleService bundleService;

    @Autowired
    ItemService itemService;

    @Autowired
    ItemMapper itemMapper;

    @Autowired
    ItemRepository itemRepository;

    @Autowired
    BundleRepository bundleRepository;

    @Autowired
    BundleMapper bundleMapper;

    @Autowired
    CacheManager cacheManager;

    @BeforeEach
    public void cleanCache() {
        cacheManager.getCache("bundles").clear();
        cacheManager.getCache("items").clear();
    }

    @Test
    public void findBundleNonAsyncTimeoutTest() {
        Assertions.assertTimeout(
                Duration.ofMillis(1000),
                () -> {
                    try {
                        BundleDB bundleDB = bundleRepository.read(3L).get();
                        List<Item> itemsList = itemRepository.readByBundleId(3L).stream().map(itemMapper::toItem).collect(Collectors.toList());
                        Bundle bundle = bundleMapper.toBundle(bundleDB, itemsList);
                    } catch (Exception e) {
                        e.printStackTrace();
                        Assertions.fail();
                    }
                }
        );
    }

    @Test
    public void findBundleAsyncTimeoutTest() {
        Assertions.assertTimeout(
                Duration.ofMillis(1000),
                () -> {
                    Bundle bundle = bundleService.find(3L);
                }
        );
    }
}
