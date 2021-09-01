package com.example.megaflats.models.entities;

import com.example.megaflats.models.enums.CodeStatus;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
public class Codes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long code;

    @JsonFormat(pattern="dd-MM-yyyy")
    private LocalDateTime start_date;

    @JsonFormat(pattern="dd-MM-yyyy")
    private LocalDateTime end_date;

    @Enumerated(EnumType.STRING)
    private CodeStatus code_status;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "users_id")
    private Users users_id;
}
