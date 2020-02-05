package org.example.shop.service.Impl;

import org.example.shop.entity.Item;
import org.example.shop.repository.ItemRepository;
import org.example.shop.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {

    private ItemRepository itemRepository;

    @Autowired
    public ItemServiceImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public Item find(Long id) {
        return null;
    }
}
