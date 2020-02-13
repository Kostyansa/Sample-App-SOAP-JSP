package org.example.shop.service.mapper;

import org.example.shop.entity.Item;
import org.example.shop.repository.dto.ItemDB;
import org.springframework.stereotype.Service;

@Service
public class ItemMapper {

    public Item toItem(ItemDB itemDB){
        return new Item(
                itemDB.getId(),
                itemDB.getName(),
                itemDB.getDescription(),
                itemDB.getPrice(),
                itemDB.getAmount()
        );
    }

    public ItemDB toItemDB(Item item){
        return new ItemDB(
                item.getId(),
                item.getName(),
                item.getDescription(),
                item.getPrice(),
                item.getAmount()
        );
    }
}
