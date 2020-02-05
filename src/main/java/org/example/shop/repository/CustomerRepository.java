package org.example.shop.repository;

import org.example.shop.repository.dto.CustomerDB;
import org.example.shop.repository.dto.CustomerOrderDB;

import java.util.Optional;

public interface CustomerRepository {

    Optional<CustomerDB> create(CustomerDB customerDB);

    Optional<CustomerDB> read(Long id);

    Optional<CustomerDB> update(CustomerDB customerDB);
}
