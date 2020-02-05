package org.example.shop.repository;

import org.example.shop.repository.dto.CustomerDB;

public interface CustomerRepository {

    void create(CustomerDB customerDB);

    CustomerDB read(Long id);

    void update(CustomerDB customerDB);
}
