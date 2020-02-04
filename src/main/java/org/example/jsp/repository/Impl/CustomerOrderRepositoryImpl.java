package org.example.jsp.repository.Impl;

import org.example.jsp.repository.CustomerOrderRepository;
import org.example.jsp.repository.dto.CustomerDB;
import org.example.jsp.repository.dto.CustomerOrderDB;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerOrderRepositoryImpl implements CustomerOrderRepository {

    @Override
    public CustomerOrderDB create(CustomerOrderDB customerOrderDB) {
        return null;
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
