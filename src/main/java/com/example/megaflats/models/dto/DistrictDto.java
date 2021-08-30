package com.example.megaflats.models.dto;

import com.example.megaflats.models.entities.CityVillage;
import lombok.Data;

@Data
public class DistrictDto {
    private Long id;

    private CityVillage city_village_id;

    private String name;
}
