package org.example.shop.repository;

import org.example.shop.repository.dto.PaymentDB;

public interface PaymentRepository {

    void create(PaymentDB paymentDB);

    PaymentDB read(Long id);

    PaymentDB readByCustomerOrderId(Long customerOrderId);

    void delete(PaymentDB paymentDB);

    boolean complete();
}
