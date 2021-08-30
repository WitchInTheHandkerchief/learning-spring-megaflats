package com.example.megaflats.models.dto;

import com.example.megaflats.models.entities.Regions;
import lombok.Data;

@Data
public class CityVillageDto {
    private Long id;

    private Regions regions_id;

    private String name;
}
