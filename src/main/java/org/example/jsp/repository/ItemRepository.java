package org.example.jsp.repository;

import org.example.jsp.repository.dto.ItemDB;

public interface ItemRepository {

    ItemDB get(Long id);
}
