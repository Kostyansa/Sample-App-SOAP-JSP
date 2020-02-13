package org.example.shop.service.Impl;

import org.example.shop.repository.CustomerOrderRepository;
import org.example.shop.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerOrderServiceImpl implements CustomerOrderService {

    private ItemService itemService;

    private BundleService bundleService;

    private CustomerService customerService;

    private CustomerOrderRepository customerOrderRepository;

    @Autowired
    public CustomerOrderServiceImpl(ItemService itemService,
                                    BundleService bundleService,
                                    CustomerService customerService,
                                    CustomerOrderRepository
                                                customerOrderRepository) {
        this.itemService = itemService;
        this.bundleService = bundleService;
        this.customerService = customerService;
        this.customerOrderRepository = customerOrderRepository;
    }
}
