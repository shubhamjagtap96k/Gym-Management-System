package com.gym.management.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount;
    private LocalDate paymentDate;
    private String paymentMethod; // e.g., "Credit Card", "Cash"

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;
}
