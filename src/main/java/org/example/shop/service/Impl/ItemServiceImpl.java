package org.example.shop.service.Impl;

import org.example.shop.entity.Item;
import org.example.shop.exception.ItemNotFoundException;
import org.example.shop.repository.ItemRepository;
import org.example.shop.service.ItemService;
import org.example.shop.service.mapper.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        return itemMapper.toItem(itemRepository.read(id).orElseThrow(ItemNotFoundException::new));
    }
}
