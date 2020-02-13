package org.example.shop.repository;

import org.example.shop.repository.dto.BundleDB;
import org.example.shop.repository.dto.CustomerDB;
import org.example.shop.repository.dto.CustomerOrderDB;

import java.util.List;
import java.util.Optional;

public interface CustomerOrderRepository {

    Optional<CustomerOrderDB> create(CustomerOrderDB customerOrderDB);

    Optional<CustomerOrderDB> update(CustomerOrderDB customerOrderDB);

    Optional<CustomerOrderDB> read(Long id);

    List<CustomerOrderDB> readByCustomer(CustomerDB customerDB);

    Optional<CustomerOrderDB> delete(CustomerOrderDB customerOrderDB);
}
