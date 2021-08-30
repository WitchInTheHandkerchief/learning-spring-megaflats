package com.example.megaflats.models.dto;

import lombok.Data;
import org.aspectj.apache.bcel.classfile.Code;

import java.time.LocalDate;

@Data
public class RequestsDto {
    private Long id;

    private LocalDate add_date;

    private boolean success;

    private Code codes_id;
}
