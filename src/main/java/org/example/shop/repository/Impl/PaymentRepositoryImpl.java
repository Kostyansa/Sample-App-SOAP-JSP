package org.example.shop.repository.Impl;

import org.example.shop.repository.PaymentRepository;
import org.example.shop.repository.dto.PaymentDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class PaymentRepositoryImpl implements PaymentRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public Optional<PaymentDB> create(PaymentDB paymentDB) {
        return Optional.empty();
    }

    @Override
    public Optional<PaymentDB> read(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<PaymentDB> readByCustomerOrderId(Long customerOrderId) {
        return Optional.empty();
    }

    @Override
    public Optional<PaymentDB> delete(PaymentDB paymentDB) {
        return Optional.empty();
    }

    @Override
    public boolean complete() {
        return false;
    }
}
