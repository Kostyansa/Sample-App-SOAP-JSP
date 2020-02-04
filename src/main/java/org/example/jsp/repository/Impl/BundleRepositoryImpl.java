package org.example.jsp.repository.Impl;

import org.example.jsp.repository.BundleRepository;
import org.example.jsp.repository.dto.BundleDB;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BundleRepositoryImpl implements BundleRepository {

    @Override
    public BundleDB create(BundleDB bundleDB) {
        return null;
    }

    @Override
    public BundleDB read(Long id) {
        return null;
    }

    @Override
    public List<BundleDB> readByName(String name) {
        return null;
    }

    @Override
    public BundleDB update(BundleDB bundleDB) {
        return null;
    }

    @Override
    public BundleDB delete(BundleDB bundleDB) {
        return null;
    }
}
