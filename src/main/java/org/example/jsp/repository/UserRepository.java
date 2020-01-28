package org.example.jsp.repository;

import org.example.jsp.repository.dto.CustomerDB;

public interface UserRepository {

    CustomerDB read(Long id);

    void update(CustomerDB customerDB);

    CustomerDB create(CustomerDB customerDB);
}
