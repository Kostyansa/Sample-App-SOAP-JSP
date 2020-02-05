package org.example.shop.repository.Impl;

import org.example.shop.repository.CustomerRepository;
import org.example.shop.repository.dto.CustomerDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public Optional<CustomerDB> create(CustomerDB customerDB) {
        return Optional.empty();
    }

    @Cacheable("customers")
    @Override
    public Optional<CustomerDB> read(Long id) {
        return Optional.empty();
    }

    @CacheEvict("customers")
    @Override
    public Optional<CustomerDB> update(CustomerDB customerDB) {
        return Optional.empty();
    }
}
