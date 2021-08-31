package com.example.megaflats.models.entities;

import com.example.megaflats.models.enums.Status;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
public class ReserveHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "house_id")
    private House house_id;

    @ManyToOne
    @JoinColumn(name = "users_id")
    private Users users_id;

    @JsonFormat(pattern="dd-MM-yyyy")
    private LocalDate start_date;

    @JsonFormat(pattern="dd-MM-yyyy")
    private LocalDate end_date;

    @Enumerated(EnumType.STRING)
    private Status status;

    private int total_price;

    @CreationTimestamp
    private LocalDate add_date;

    @UpdateTimestamp
    private LocalDate edit_date;
}
