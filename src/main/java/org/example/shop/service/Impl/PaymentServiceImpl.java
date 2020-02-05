package org.example.shop.service.Impl;

import org.example.shop.repository.PaymentRepository;
import org.example.shop.service.CustomerOrderService;
import org.example.shop.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    private PaymentRepository paymentRepository;

    private CustomerOrderService customerOrderService;

    @Autowired
    public PaymentServiceImpl(PaymentRepository paymentRepository, CustomerOrderService customerOrderService) {
        this.paymentRepository = paymentRepository;
        this.customerOrderService = customerOrderService;
    }
}
