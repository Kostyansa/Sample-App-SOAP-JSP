package org.example.jsp.repository;

import org.example.jsp.repository.dto.BundleDB;

import java.util.List;

public interface BundleRepository {

    BundleDB read(Long id);

    List<BundleDB> readByName(String name);
}
