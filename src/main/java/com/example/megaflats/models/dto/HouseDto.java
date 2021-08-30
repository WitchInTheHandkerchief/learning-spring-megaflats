package com.example.megaflats.models.dto;

import com.example.megaflats.models.entities.CityVillage;
import com.example.megaflats.models.entities.District;
import com.example.megaflats.models.entities.Types;
import com.example.megaflats.models.entities.Users;
import lombok.Data;

import java.time.LocalDate;

@Data
public class HouseDto {
    private Long id;

    private int rooms;

    private String description;

    private int floor;

    private int area;

    private int price;

    private Types types_id;

    private boolean internet;

    private boolean furniture;

    private Users users_id;

    private CityVillage city_village_id;

    private District district_id;

    private LocalDate add_date;

    private LocalDate edit_date;

    private double lat;

    private double lon;

    private String address;
}
