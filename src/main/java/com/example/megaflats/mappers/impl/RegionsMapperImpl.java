package com.example.megaflats.mappers.impl;

import com.example.megaflats.mappers.RegionsMapper;
import com.example.megaflats.models.dto.RegionsDto;
import com.example.megaflats.models.entities.Regions;
import org.springframework.stereotype.Service;

@Service
public class RegionsMapperImpl implements RegionsMapper {
    @Override
    public Regions toRegions(RegionsDto regionsDto) {
        Regions regions = new Regions();
        regions.setId(regionsDto.getId());
        regions.setName(regionsDto.getName());
        return regions;
    }

    @Override
    public RegionsDto toRegionsDto(Regions regions) {
        RegionsDto regionsDto = new RegionsDto();
        regionsDto.setId(regions.getId());
        regionsDto.setName(regions.getName());
        return regionsDto;
    }
}
