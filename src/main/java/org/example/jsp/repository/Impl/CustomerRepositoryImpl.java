package org.example.jsp.repository.Impl;

import org.example.jsp.repository.CustomerRepository;
import org.example.jsp.repository.dto.CustomerDB;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public CustomerDB create(CustomerDB customerDB) {
        return null;
    }

    @Override
    public CustomerDB read(Long id) {
        return null;
    }

    @Override
    public void update(CustomerDB customerDB) {

    }
}
