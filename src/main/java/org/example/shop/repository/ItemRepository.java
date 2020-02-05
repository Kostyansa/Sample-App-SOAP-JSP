package org.example.shop.repository;

import org.example.shop.repository.dto.ItemDB;

import java.util.List;
import java.util.Optional;

public interface ItemRepository {

    Optional<ItemDB> create(ItemDB itemDB);

    Optional<ItemDB> read(Long id);

    List<ItemDB> readByBundleId(Long id);

    Optional<ItemDB> update(ItemDB itemDB);

    Optional<ItemDB> delete(ItemDB itemDB);
}
