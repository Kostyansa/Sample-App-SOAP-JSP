package org.example.shop.repository;

import org.example.shop.repository.dto.BundleDB;

import java.util.Optional;

public interface BundleRepository {

    Optional<BundleDB> create(BundleDB bundleDB);

    Optional<BundleDB> read(Long id);

    Optional<BundleDB> readByName(String name);

    Optional<BundleDB> update(BundleDB bundleDB);

    Optional<BundleDB> delete(BundleDB bundleDB);
}
