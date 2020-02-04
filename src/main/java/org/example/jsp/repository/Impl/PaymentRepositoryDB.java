package org.example.jsp.repository.Impl;

import org.example.jsp.repository.PaymentRepository;
import org.example.jsp.repository.dto.PaymentDB;

public class PaymentRepositoryDB implements PaymentRepository {
    @Override
    public PaymentDB create(PaymentDB paymentDB) {
        return null;
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
    public PaymentDB delete(PaymentDB paymentDB) {
        return null;
    }

    @Override
    public boolean complete() {
        return false;
    }
}
