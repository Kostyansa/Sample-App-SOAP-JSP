package org.example.shop.service.mapper;

import org.example.shop.entity.Bundle;
import org.example.shop.entity.Item;
import org.example.shop.repository.dto.BundleDB;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BundleMapper {

    public Bundle toBundle(BundleDB bundleDB, List<Item> items){
        return new Bundle(
                bundleDB.getId(),
                bundleDB.getName(),
                bundleDB.getDescription(),
                bundleDB.getPrice(),
                items
        );
    }
}
