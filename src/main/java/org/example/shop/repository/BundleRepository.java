package org.example.shop.repository;

import org.example.shop.repository.dto.BundleDB;

import java.util.Optional;

public interface BundleRepository {

    int create(BundleDB bundleDB);

    Optional<BundleDB> read(Long id);

    Optional<BundleDB> readByName(String name);

    int update(BundleDB bundleDB);

    int delete(BundleDB bundleDB);
}
