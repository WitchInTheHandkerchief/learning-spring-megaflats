package com.example.megaflats.mappers.impl;

import com.example.megaflats.mappers.DistrictMapper;
import com.example.megaflats.models.dto.DistrictDto;
import com.example.megaflats.models.entities.District;
import org.springframework.stereotype.Service;

@Service
public class DistrictMapperImpl implements DistrictMapper {
    @Override
    public District toDistrict(DistrictDto districtDto) {
        return null;
    }

    @Override
    public DistrictDto toDistrictDto(District district) {
        return null;
    }
}
