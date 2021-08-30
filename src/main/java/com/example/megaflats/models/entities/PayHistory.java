package com.example.megaflats.models.entities;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
public class PayHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "reserve_history_id")
    private ReserveHistory reserve_history_id;

    private int cash;

    @CreationTimestamp
    private LocalDate add_date;
}
