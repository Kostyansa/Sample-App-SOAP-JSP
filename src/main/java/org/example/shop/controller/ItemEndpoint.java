package org.example.shop.controller;

import org.example.shop.controller.mapper.ItemResourceMapper;
import org.example.shop.entity.Item;
import org.example.shop.exception.ItemNotFoundException;
import org.example.shop.service.ItemService;
import org.example.shop.resource.items.ItemRequest;
import org.example.shop.resource.items.ItemResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.Optional;
import java.util.concurrent.TimeUnit;

@Endpoint
public class ItemEndpoint {

    private static final String NAMESPACE_URI = "http://example.org/shop/resource/items";

    private ItemService itemService;

    private ItemResourceMapper itemResourceMapper;

    @Autowired
    public ItemEndpoint(ItemService itemService, ItemResourceMapper itemResourceMapper) {
        this.itemService = itemService;
        this.itemResourceMapper = itemResourceMapper;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "ItemRequest")
    @ResponsePayload
    public ItemResponse getStudent(@RequestPayload ItemRequest request) {

        ItemResponse response = new ItemResponse();
        response.setItem(
                itemResourceMapper.toResource(
                        itemService.find(request.getId()).get(3, TimeUnit.SECONDS)
                        )
                );
        return response;
    }
}
