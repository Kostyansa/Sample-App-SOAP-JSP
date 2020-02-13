package org.example.shop.service.Impl;

import org.example.shop.entity.Item;
import org.example.shop.exception.ItemNotFoundException;
import org.example.shop.repository.ItemRepository;
import org.example.shop.service.ItemService;
import org.example.shop.service.mapper.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

@Service
public class ItemServiceImpl implements ItemService {

    private ItemRepository itemRepository;

    private ItemMapper itemMapper;

    @Autowired
    public ItemServiceImpl(ItemRepository itemRepository, ItemMapper itemMapper) {
        this.itemRepository = itemRepository;
        this.itemMapper = itemMapper;
    }

    @Override
    public Item find(Long id) {
        return itemMapper.toItem(
                        itemRepository.read(id)
                                .orElseThrow(ItemNotFoundException::new)
        );
    }

    @Override
    @Async
    public CompletableFuture<List<Item>> findByBundleId(Long id){
        return CompletableFuture.supplyAsync(
                () -> itemRepository.readByBundleId(id)
                        .stream()
                        .map(itemMapper::toItem)
                        .collect(Collectors.toList())
                );
    }

    @Override
    public List<Item> findItemsWithLimitOffset(Long limit, Long offset){
        return itemRepository.read(limit, offset).stream()
                .map(itemMapper::toItem)
                .collect(Collectors.toList());
    }
}
