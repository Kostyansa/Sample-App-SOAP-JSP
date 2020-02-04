package org.example.jsp.repository;

import org.example.jsp.repository.dto.ItemDB;

public interface ItemRepository {

    ItemDB create(ItemDB itemDB);

    ItemDB read(Long id);

    ItemDB update(ItemDB itemDB);

    ItemDB deletes(ItemDB itemDB);
}
