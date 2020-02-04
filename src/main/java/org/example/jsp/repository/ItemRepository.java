package org.example.jsp.repository;

import org.example.jsp.repository.dto.ItemDB;

import java.util.List;

public interface ItemRepository {

    ItemDB create(ItemDB itemDB);

    ItemDB read(Long id);

    List<ItemDB> readByBundleId(Long id);

    ItemDB update(ItemDB itemDB);

    ItemDB delete(ItemDB itemDB);
}
