package org.example.shop.controller.mapper;

import org.example.shop.resource.items.Item;
import org.springframework.stereotype.Service;

@Service
public class ItemResourceMapper {

    public Item toResource(org.example.shop.entity.Item item){
        Item resource = new Item();
        resource.setName(item.getName());
        resource.setDescription(item.getDescription());
        resource.setPrice(item.getPrice());
        resource.setAmount(item.getAmount());
        return resource;
    }
}
