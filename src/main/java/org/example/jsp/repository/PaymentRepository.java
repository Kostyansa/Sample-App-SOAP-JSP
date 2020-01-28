package org.example.jsp.repository;

import org.example.jsp.repository.dto.CustomerOrderDB;
import org.example.jsp.repository.dto.PaymentDB;

public interface PaymentRepository {

    PaymentDB get(Long id);

    PaymentDB getByCustomerOrderId(Long customerOrderId);

    void complete();
}
