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

@Repository
public class CustomerOrderRepositoryImpl implements CustomerOrderRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void create(CustomerOrderDB customerOrderDB) {

    }

    @Override
    @CacheEvict("customers")
    public void update(CustomerOrderDB customerOrderDB) {

    }

    @Override
    @Cacheable("customers")
    public CustomerOrderDB read(Long id) {
        return null;
    }

    @Override
    @Cacheable("customers")
    public List<CustomerOrderDB> readByCustomer(CustomerDB customerDB) {
        return null;
    }

    @Override
    @CacheEvict("customers")
    public void delete(CustomerOrderDB customerOrderDB) {

    }
}
