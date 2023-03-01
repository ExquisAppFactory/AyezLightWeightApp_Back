package com.lightweightapp.services.dbservice.repository;

import com.lightweightapp.services.dbservice.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaymentRepository extends JpaRepository<Payment, Integer>
{
    List<Payment> findPaymentById(int paymentId);
}
