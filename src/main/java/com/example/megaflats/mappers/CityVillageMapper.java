package com.example.megaflats.mappers;

import com.example.megaflats.models.dto.CityVillageDto;
import com.example.megaflats.models.entities.CityVillage;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CityVillageMapper {
    CityVillageMapper INSTANCE = Mappers.getMapper(CityVillageMapper.class);

    CityVillage toCityVillage(CityVillageDto cityVillageDto);

    CityVillageDto toCityVillageDto(CityVillage cityVillage);
}
