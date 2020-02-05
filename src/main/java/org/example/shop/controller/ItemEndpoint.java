package org.example.shop.controller;

import org.example.shop.controller.mapper.ItemResourceMapper;
import org.example.shop.service.ItemService;
import org.example.shop.resource.items.ItemRequest;
import org.example.shop.resource.items.ItemResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ItemEndpoint {

    private static final String NAMESPACE_URI = "http://resource.shop.example.org/items";

    private ItemService itemService;

    private ItemResourceMapper itemResourceMapper;

    @Autowired
    public ItemEndpoint(ItemService itemService, ItemResourceMapper itemResourceMapper) {
        this.itemService = itemService;
        this.itemResourceMapper = itemResourceMapper;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "StudentDetailsRequest")
    @ResponsePayload
    public ItemResponse getStudent(@RequestPayload ItemRequest request) {
        ItemResponse response = new ItemResponse();
        response.setItem(
                itemResourceMapper.toResource(
                        itemService.find(request.getId())
                        )
        );
        return response;
    }
}
