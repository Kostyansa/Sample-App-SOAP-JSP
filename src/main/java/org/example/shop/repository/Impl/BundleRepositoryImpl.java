package org.example.shop.repository.Impl;

import org.example.shop.repository.BundleRepository;
import org.example.shop.repository.dto.BundleDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BundleRepositoryImpl implements BundleRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void create(BundleDB bundleDB) {

    }

    @Override
    @Cacheable("bundles")
    public BundleDB read(Long id) {
        return null;
    }

    @Override
    @Cacheable("bundles")
    public BundleDB readByName(String name) {
        return null;
    }

    @Override
    @CacheEvict("bundles")
    public void update(BundleDB bundleDB) {

    }

    @Override
    @CacheEvict("bundles")
    public void delete(BundleDB bundleDB) {

    }
}
