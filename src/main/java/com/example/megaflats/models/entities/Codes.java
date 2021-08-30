package com.example.megaflats.models.entities;

import com.example.megaflats.models.enums.CodeStatus;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
public class Codes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long code;

    private LocalDate start_date;

    private LocalDate end_date;

    @Enumerated(EnumType.STRING)
    private CodeStatus code_status;

    @ManyToOne
    @JoinColumn(name = "users_id")
    private Users users_id;
}
