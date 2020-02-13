package org.example.shop.repository.Impl;

import org.example.shop.repository.CustomerOrderRepository;
import org.example.shop.repository.dto.CustomerDB;
import org.example.shop.repository.dto.CustomerOrderDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CustomerOrderRepositoryImpl implements CustomerOrderRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public Optional<CustomerOrderDB> create(CustomerOrderDB customerOrderDB) {
        return Optional.empty();
    }

    @Override
    public Optional<CustomerOrderDB> update(CustomerOrderDB customerOrderDB) {
        return Optional.empty();
    }

    @Override
    public Optional<CustomerOrderDB> read(Long id) {
        return Optional.empty();
    }

    @Override
    public List<CustomerOrderDB> readByCustomer(CustomerDB customerDB) {
        return null;
    }

    @Override
    public Optional<CustomerOrderDB> delete(CustomerOrderDB customerOrderDB) {
        return Optional.empty();
    }
}
