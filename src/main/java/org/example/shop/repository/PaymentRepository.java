package org.example.shop.repository;

import org.example.shop.repository.dto.ItemDB;
import org.example.shop.repository.dto.PaymentDB;

import java.util.Optional;

public interface PaymentRepository {

    Optional<PaymentDB> create(PaymentDB paymentDB);

    Optional<PaymentDB> read(Long id);

    Optional<PaymentDB> readByCustomerOrderId(Long customerOrderId);

    Optional<PaymentDB> delete(PaymentDB paymentDB);

    boolean complete();
}
