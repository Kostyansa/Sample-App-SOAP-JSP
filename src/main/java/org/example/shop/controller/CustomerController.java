package org.example.shop.controller;

import org.example.shop.entity.Customer;
import org.example.shop.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/customers")
    public List<Customer> findAll(){
        return customerService.findAll();
    }

    @PostMapping("/customers")
    public Customer save(@RequestBody Customer newCustomer){
        return customerService.save(newCustomer);
    }

    @GetMapping("/customers/{id}")
    public Customer find(@PathVariable Long id){
        return customerService.find(id);
    }

    @PutMapping("/customers/{id}")
    public Customer update(@RequestBody Customer customer, @PathVariable Long id){
        customer.setId(id);
        return customerService.update(customer);
    }

    @DeleteMapping("/customers/{id}")
    public Customer delete(@PathVariable Long id){
        return customerService.delete(id);
    }
}
