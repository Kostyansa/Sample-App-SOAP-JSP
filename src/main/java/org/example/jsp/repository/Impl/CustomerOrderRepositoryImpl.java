package org.example.jsp.repository.Impl;

import org.example.jsp.repository.CustomerOrderRepository;
import org.example.jsp.repository.dto.CustomerDB;
import org.example.jsp.repository.dto.CustomerOrderDB;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerOrderRepositoryImpl implements CustomerOrderRepository {
    @Override
    public CustomerOrderDB create(CustomerOrderDB customerOrderDB) {
        return null;
    }

    @Override
    public void update(CustomerOrderDB customerOrderDB) {

    }

    @Override
    public CustomerOrderDB read(Long id) {
        return null;
    }

    @Override
    public List<CustomerOrderDB> readByCustomer(CustomerDB customerDB) {
        return null;
    }

    @Override
    public void delete(CustomerOrderDB customerOrderDB) {

    }
}
