package org.example.jsp.service.Impl;

import org.example.jsp.service.BundleService;
import org.example.jsp.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BundleServiceImpl implements BundleService {

    @Autowired
    private ItemService itemService;
}
