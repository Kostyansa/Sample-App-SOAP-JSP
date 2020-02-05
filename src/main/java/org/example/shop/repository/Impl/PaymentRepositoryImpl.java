package org.example.shop.repository.Impl;

import org.example.shop.repository.PaymentRepository;
import org.example.shop.repository.dto.PaymentDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PaymentRepositoryImpl implements PaymentRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void create(PaymentDB paymentDB) {

    }

    @Override
    public PaymentDB read(Long id) {
        return null;
    }

    @Override
    public PaymentDB readByCustomerOrderId(Long customerOrderId) {
        return null;
    }

    @Override
    public void delete(PaymentDB paymentDB) {

    }

    @Override
    public boolean complete() {
        return false;
    }
}
