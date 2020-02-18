package org.example.shop.repository;

import org.example.shop.repository.dto.BundleDB;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;
import java.util.Optional;

public interface BundleRepository {

    int create(BundleDB bundleDB);

    Optional<BundleDB> read(Long id);

    @Cacheable("bundles")
    List<BundleDB> read(Long limit, Long offset);

    Optional<BundleDB> readByName(String name);

    int update(BundleDB bundleDB);

    int delete(BundleDB bundleDB);
}
