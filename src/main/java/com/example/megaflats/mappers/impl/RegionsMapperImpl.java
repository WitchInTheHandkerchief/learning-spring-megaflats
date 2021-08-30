package com.example.megaflats.mappers.impl;

import com.example.megaflats.mappers.RegionsMapper;
import com.example.megaflats.models.dto.RegionsDto;
import com.example.megaflats.models.entities.Regions;
import org.springframework.stereotype.Service;

@Service
public class RegionsMapperImpl implements RegionsMapper {
    @Override
    public Regions toRegions(RegionsDto regionsDto) {
        return null;
    }

    @Override
    public RegionsDto toRegionsDto(Regions regions) {
        return null;
    }
}
