package org.example.jsp.repository;

import org.example.jsp.repository.dto.CustomerDB;
import org.example.jsp.repository.dto.CustomerOrderDB;

import java.util.List;

public interface CustomerOrderRepository {

    CustomerOrderDB create(CustomerOrderDB customerOrderDB);

    void update(CustomerOrderDB customerOrderDB);

    CustomerOrderDB read(Long id);

    List<CustomerOrderDB> readByCustomer(CustomerDB customerDB);

    void delete(CustomerOrderDB customerOrderDB);
}
