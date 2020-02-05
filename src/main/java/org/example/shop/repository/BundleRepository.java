package org.example.shop.repository;

import org.example.shop.repository.dto.BundleDB;

public interface BundleRepository {

    void create(BundleDB bundleDB);

    BundleDB read(Long id);

    BundleDB readByName(String name);

    void update(BundleDB bundleDB);

    void delete(BundleDB bundleDB);
}
