package com.example.megaflats.models.dto;

import com.example.megaflats.models.entities.Users;
import com.example.megaflats.models.enums.CodeStatus;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;

@Data
public class CodesDto {
    private Long id;

    private Long code;

    @JsonFormat(pattern="dd-MM-yyyy")
    private LocalDate start_date;

    @JsonFormat(pattern="dd-MM-yyyy")
    private LocalDate end_date;

    private CodeStatus code_status;

    private Users users_id;
}
