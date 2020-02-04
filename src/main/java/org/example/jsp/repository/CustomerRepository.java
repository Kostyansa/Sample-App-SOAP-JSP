package org.example.jsp.repository;

import org.example.jsp.repository.dto.CustomerDB;

public interface CustomerRepository {

    CustomerDB create(CustomerDB customerDB);

    CustomerDB read(Long id);

    void update(CustomerDB customerDB);
}
