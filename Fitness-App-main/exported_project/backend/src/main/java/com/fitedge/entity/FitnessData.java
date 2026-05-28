package com.fitedge.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "fitness_data")
@Data
public class FitnessData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    private int steps;
    private int calories;
    private int heartRate;
    private LocalDateTime updatedAt;
}
