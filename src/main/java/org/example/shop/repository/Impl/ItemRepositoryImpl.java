package org.example.shop.repository.Impl;

import org.example.shop.repository.ItemRepository;
import org.example.shop.repository.dto.ItemDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ItemRepositoryImpl implements ItemRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void create(ItemDB itemDB) {

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
    public void update(ItemDB itemDB) {

    }

    @Override
    @CacheEvict("items")
    public void delete(ItemDB itemDB) {

    }
}
