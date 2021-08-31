package com.example.megaflats.models.dto;

import com.example.megaflats.models.entities.Codes;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.aspectj.apache.bcel.classfile.Code;

import java.time.LocalDate;

@Data
public class RequestsDto {
    private Long id;

    private LocalDate add_date;

    private boolean success;

    private Codes codes_id;
}
