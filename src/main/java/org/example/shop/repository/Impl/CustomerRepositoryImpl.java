package org.example.shop.repository.Impl;

import org.example.shop.repository.CustomerRepository;
import org.example.shop.repository.dto.CustomerDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void create(CustomerDB customerDB) {

    }

    @Override
    public CustomerDB read(Long id) {
        return null;
    }

    @Override
    public void update(CustomerDB customerDB) {

    }
}
