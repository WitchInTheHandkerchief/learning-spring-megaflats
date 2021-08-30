package com.example.megaflats.models.dto;

import com.example.megaflats.models.entities.ReserveHistory;
import lombok.Data;

import java.time.LocalDate;

@Data
public class PayHistoryDto {
    private Long id;

    private ReserveHistory reserve_history_id;

    private int cash;

    private LocalDate add_date;
}
