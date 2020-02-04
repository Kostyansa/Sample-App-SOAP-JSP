package org.example.jsp.repository;

import org.example.jsp.repository.dto.BundleDB;

import java.util.List;

public interface BundleRepository {

    BundleDB create(BundleDB bundleDB);

    BundleDB read(Long id);

    List<BundleDB> readByName(String name);

    BundleDB update(BundleDB bundleDB);

    BundleDB delete(BundleDB bundleDB);
}
