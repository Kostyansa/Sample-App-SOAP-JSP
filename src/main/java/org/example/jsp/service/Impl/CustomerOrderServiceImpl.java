package org.example.jsp.service.Impl;

import org.example.jsp.repository.CustomerOrderRepository;
import org.example.jsp.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerOrderServiceImpl implements CustomerOrderService {

    @Autowired
    private ItemService itemService;

    @Autowired
    private BundleService bundleService;

    @Autowired
    private UserService userService;

    @Autowired
    private CustomerOrderRepository customerOrderRepository;

}
