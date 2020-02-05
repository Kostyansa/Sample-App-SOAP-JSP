package org.example.shop.service.Impl;

import org.example.shop.service.BundleService;
import org.example.shop.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BundleServiceImpl implements BundleService {

    private ItemService itemService;

    @Autowired
    public BundleServiceImpl(ItemService itemService) {
        this.itemService = itemService;
    }
}
