package com.example.megaflats.mappers.impl;

import com.example.megaflats.mappers.HouseMapper;
import com.example.megaflats.models.dto.HouseDto;
import com.example.megaflats.models.entities.House;
import org.springframework.stereotype.Service;

@Service
public class HouseMapperImpl implements HouseMapper {
    @Override
    public House toHouse(HouseDto houseDto) {
        return null;
    }

    @Override
    public HouseDto toHouseDto(House house) {
        return null;
    }
}
