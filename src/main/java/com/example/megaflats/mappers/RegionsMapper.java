package com.example.megaflats.mappers;

import com.example.megaflats.models.dto.RegionsDto;
import com.example.megaflats.models.entities.Regions;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RegionsMapper {
    RegionsMapper INSTANCE = Mappers.getMapper(RegionsMapper.class);

    Regions toRegions(RegionsDto regionsDto);

    RegionsDto toRegionsDto(Regions regions);
}
