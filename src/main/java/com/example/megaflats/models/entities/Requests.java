package com.example.megaflats.models.entities;

import lombok.Data;
import org.aspectj.apache.bcel.classfile.Code;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
public class Requests {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreationTimestamp
    private LocalDate add_date;

    private boolean success;

    @ManyToOne
    @JoinColumn(name = "codes_id")
    private Code codes_id;
}
