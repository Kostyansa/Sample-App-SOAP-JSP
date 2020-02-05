package org.example.shop.repository.Impl;

import org.example.shop.repository.ItemRepository;
import org.example.shop.repository.dto.ItemDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ItemRepositoryImpl implements ItemRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public Optional<ItemDB> create(ItemDB itemDB) {
        return Optional.empty();
    }

    @Cacheable("items")
    @Override
    public Optional<ItemDB> read(Long id) {
        return Optional.empty();
    }

    @Cacheable("items")
    @Override
    public List<ItemDB> readByBundleId(Long id) {
        return null;
    }

    @CacheEvict("customers")
    @Override
    public Optional<ItemDB> update(ItemDB itemDB) {
        return Optional.empty();
    }

    @CacheEvict("customers")
    @Override
    public Optional<ItemDB> delete(ItemDB itemDB) {
        return Optional.empty();
    }
}
