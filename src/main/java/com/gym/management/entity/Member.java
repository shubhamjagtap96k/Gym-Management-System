package com.gym.management.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "members")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private LocalDate joinDate;
    private String membershipType; // e.g., "Monthly", "Yearly"
    private boolean active;

    @ManyToOne
    @JoinColumn(name = "trainer_id")
    private Trainer trainer;
}
