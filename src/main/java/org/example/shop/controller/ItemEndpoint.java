package org.example.shop.controller;

import org.example.shop.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ws.server.endpoint.annotation.Endpoint;

@Controller
@Endpoint
public class ItemEndpoint {

    private ItemService itemService;

    @Autowired
    public ItemEndpoint(ItemService itemService) {
        this.itemService = itemService;
    }

    //public ItemResponse
}
