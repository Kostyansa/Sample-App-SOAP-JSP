package org.example.shop.service.Impl;

import lombok.RequiredArgsConstructor;
import org.example.shop.entity.Customer;
import org.example.shop.exception.CustomerNotFoundException;
import org.example.shop.repository.CustomerRepository;
import org.example.shop.repository.dto.CustomerDB;
import org.example.shop.service.CustomerService;
import org.example.shop.service.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    private final CustomerMapper customerMapper;

    @Override
    public List<Customer> findAll() {
        return customerRepository.readAll()
                .stream()
                .map(customerMapper::toCustomer)
                .collect(Collectors.toList());
    }

    @Override
    public Customer save(Customer newCustomer) {
        Long id = newCustomer.getId();
        if ((id == null) || !customerRepository.read(id).isPresent()){
            customerRepository.create(customerMapper.toCustomerDB(newCustomer));
        } else {
            customerRepository.update(customerMapper.toCustomerDB(newCustomer));
        }
        return newCustomer;
    }

    @Override
    public Customer find(Long id) {
        return customerMapper.toCustomer(customerRepository.read(id).orElseThrow(CustomerNotFoundException::new));
    }

    @Override
    public Customer update(Customer customer) {
        Optional<CustomerDB> customerDB = customerRepository.read(customer.getId());
        if (customerDB.isPresent()){
            customerRepository.update(customerMapper.toCustomerDB(customer));
        }
        else{
            throw new CustomerNotFoundException();
        }
        return customer;
    }

    @Override
    public Customer delete(Long id) {
        Optional<CustomerDB> customerDB = customerRepository.read(id);
        customerRepository.delete(customerDB.orElseThrow(CustomerNotFoundException::new));
        return customerMapper.toCustomer(customerDB.get());
    }
}
