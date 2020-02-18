package org.example.shop.repository;

import org.example.shop.repository.dto.ItemDB;
import org.springframework.cache.annotation.Cacheable;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public interface ItemRepository {

    int create(ItemDB itemDB);

    Optional<ItemDB> read(Long id);

    List<ItemDB> read(Long offset, Long limit);

    List<ItemDB> readByBundleId(Long id);

    int update(ItemDB itemDB);

    int updateAvailability(ItemDB itemDB);

    int delete(ItemDB itemDB);

    Long maxPage(Long limit);

    List<ItemDB> read(Long limit, Long offset, String name);
}
