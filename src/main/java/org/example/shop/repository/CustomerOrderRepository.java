package org.example.shop.repository;

import org.example.shop.repository.dto.CustomerDB;
import org.example.shop.repository.dto.CustomerOrderDB;

import java.util.List;

public interface CustomerOrderRepository {

    void create(CustomerOrderDB customerOrderDB);

    void update(CustomerOrderDB customerOrderDB);

    CustomerOrderDB read(Long id);

    List<CustomerOrderDB> readByCustomer(CustomerDB customerDB);

    void delete(CustomerOrderDB customerOrderDB);
}
