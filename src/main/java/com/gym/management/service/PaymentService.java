package com.gym.management.service;

import com.gym.management.entity.Payment;
import com.gym.management.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;

    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

    public Payment savePayment(Payment payment) {
        // Here you might want to link payment to member via logic if dto is used,
        // but for now relying on entity relationship being set before saving
        return paymentRepository.save(payment);
    }
}
