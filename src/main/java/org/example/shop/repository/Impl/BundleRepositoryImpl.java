package org.example.shop.repository.Impl;

import org.example.shop.repository.BundleRepository;
import org.example.shop.repository.dto.BundleDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class BundleRepositoryImpl implements BundleRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public Optional<BundleDB> create(BundleDB bundleDB) {
        return Optional.empty();
    }

    @Cacheable("bundles")
    @Override
    public Optional<BundleDB> read(Long id) {
        return Optional.empty();
    }

    @Cacheable("bundles")
    @Override
    public Optional<BundleDB> readByName(String name) {
        return Optional.empty();
    }

    @CacheEvict("bundles")
    @Override
    public Optional<BundleDB> update(BundleDB bundleDB) {
        return Optional.empty();
    }

    @CacheEvict("bundles")
    @Override
    public Optional<BundleDB> delete(BundleDB bundleDB) {
        return Optional.empty();
    }
}
