package org.example.shop.repository;

import org.example.shop.repository.dto.CustomerDB;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository {

    int create(CustomerDB customerDB);

    Optional<CustomerDB> read(Long id);

    List<CustomerDB> readAll();

    int update(CustomerDB customerDB);

    int delete(CustomerDB customerDB);
}
