package org.example.jsp.repository;

import org.example.jsp.repository.dto.BundleDB;

import java.util.List;

public interface BundleRepository {

    BundleDB get(Long id);

    List<BundleDB> getByName(String name);
}
