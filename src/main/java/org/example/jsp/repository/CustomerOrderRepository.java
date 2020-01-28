package org.example.jsp.repository;

import org.example.jsp.repository.dto.CustomerDB;
import org.example.jsp.repository.dto.CustomerOrderDB;

import java.util.List;

public interface CustomerOrderRepository {

    CustomerOrderDB create(CustomerOrderDB customerOrderDB);

    void update(CustomerOrderDB customerOrderDB);

    CustomerOrderDB get(Long id);

    List<CustomerOrderDB> getByCustomer(CustomerDB customerDB);
}
