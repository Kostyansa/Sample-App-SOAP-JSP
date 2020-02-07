package org.example.shop.service;

import org.example.shop.entity.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> findAll();

    Customer save(Customer newCustomer);

    Customer find(Long id);

    Customer update(Customer customer);

    Customer delete(Long id);
}
