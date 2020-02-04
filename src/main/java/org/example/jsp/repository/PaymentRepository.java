package org.example.jsp.repository;

import org.example.jsp.repository.dto.CustomerOrderDB;
import org.example.jsp.repository.dto.PaymentDB;

public interface PaymentRepository {

    PaymentDB create(PaymentDB paymentDB);

    PaymentDB read(Long id);

    PaymentDB readByCustomerOrderId(Long customerOrderId);

    PaymentDB delete(PaymentDB paymentDB);

    boolean complete();
}
