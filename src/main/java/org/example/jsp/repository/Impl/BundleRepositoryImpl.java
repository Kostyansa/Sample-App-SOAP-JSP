package org.example.jsp.repository.Impl;

import org.example.jsp.configuration.AppConfiguration;
import org.example.jsp.repository.BundleRepository;
import org.example.jsp.repository.dto.BundleDB;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BundleRepositoryImpl implements BundleRepository {

    @Override
    public BundleDB create(BundleDB bundleDB) {
        return null;
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
    public BundleDB update(BundleDB bundleDB) {
        return null;
    }

    @Override
    @CacheEvict("bundles")
    public BundleDB delete(BundleDB bundleDB) {
        return null;
    }
}
