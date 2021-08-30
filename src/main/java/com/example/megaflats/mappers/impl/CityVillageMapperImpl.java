package com.example.megaflats.mappers.impl;

import com.example.megaflats.mappers.CityVillageMapper;
import com.example.megaflats.models.dto.CityVillageDto;
import com.example.megaflats.models.entities.CityVillage;
import org.springframework.stereotype.Service;

@Service
public class CityVillageMapperImpl implements CityVillageMapper {
    @Override
    public CityVillage toCityVillage(CityVillageDto cityVillageDto) {
        CityVillage cityVillage = new CityVillage();
        cityVillage.setId(cityVillageDto.getId());
        cityVillage.setRegions_id(cityVillageDto.getRegions_id());
        cityVillage.setName(cityVillageDto.getName());
        return cityVillage;
    }

    @Override
    public CityVillageDto toCityVillageDto(CityVillage cityVillage) {
        CityVillageDto cityVillageDto = new CityVillageDto();
        cityVillageDto.setId(cityVillage.getId());
        cityVillageDto.setRegions_id(cityVillage.getRegions_id());
        cityVillageDto.setName(cityVillage.getName());
        return cityVillageDto;
    }
}
