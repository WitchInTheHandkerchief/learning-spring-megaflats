package com.example.megaflats.models.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UsersDto {
    private Long id;

    private String phone;

    private LocalDate block_date;
}
