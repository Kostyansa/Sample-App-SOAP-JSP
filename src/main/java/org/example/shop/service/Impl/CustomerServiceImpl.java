package org.example.shop.service.Impl;

import org.example.shop.entity.Customer;
import org.example.shop.repository.CustomerRepository;
import org.example.shop.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll() {
        return null;
    }

    @Override
    public Customer save(Customer newCustomer) {
        return null;
    }

    @Override
    public Customer find(Long id) {
        return null;
    }

    @Override
    public Customer delete(Long id) {
        return null;
    }
}
