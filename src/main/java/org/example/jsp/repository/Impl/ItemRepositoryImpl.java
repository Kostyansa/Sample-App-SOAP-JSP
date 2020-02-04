package org.example.jsp.repository.Impl;

import org.example.jsp.configuration.AppConfiguration;
import org.example.jsp.repository.ItemRepository;
import org.example.jsp.repository.dto.ItemDB;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ItemRepositoryImpl implements ItemRepository {
    @Override
    public ItemDB create(ItemDB itemDB) {
        return null;
    }

    @Override
    @Cacheable("items")
    public ItemDB read(Long id) {
        return null;
    }

    @Override
    @Cacheable("items")
    public List<ItemDB> readByBundleId(Long id) {
        return null;
    }

    @Override
    @CacheEvict("items")
    public ItemDB update(ItemDB itemDB) {
        return null;
    }

    @Override
    @CacheEvict("items")
    public ItemDB delete(ItemDB itemDB) {
        return null;
    }
}
