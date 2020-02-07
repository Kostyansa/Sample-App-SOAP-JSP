package org.example.shop.service.mapper;

import org.example.shop.entity.Customer;
import org.example.shop.repository.dto.CustomerDB;
import org.springframework.stereotype.Service;

@Service
public class CustomerMapper {

    public Customer toCustomer(CustomerDB customerDB){
        return new Customer(
                customerDB.getId(),
                customerDB.getLogin(),
                customerDB.getFullName(),
                customerDB.getPassword()
        );
    }

    public CustomerDB toCustomerDB(Customer customer){
        return new CustomerDB(
                customer.getId(),
                customer.getLogin(),
                customer.getFullName(),
                customer.getPassword()
        );
    }
}
