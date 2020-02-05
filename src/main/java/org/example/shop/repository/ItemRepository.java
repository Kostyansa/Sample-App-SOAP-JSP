package org.example.shop.repository;

import org.example.shop.repository.dto.ItemDB;

import java.util.List;

public interface ItemRepository {

    void create(ItemDB itemDB);

    ItemDB read(Long id);

    List<ItemDB> readByBundleId(Long id);

    void update(ItemDB itemDB);

    void delete(ItemDB itemDB);
}
