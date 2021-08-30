package com.example.megaflats.mappers.impl;

import com.example.megaflats.mappers.DistrictMapper;
import com.example.megaflats.models.dto.DistrictDto;
import com.example.megaflats.models.entities.District;
import org.springframework.stereotype.Service;

@Service
public class DistrictMapperImpl implements DistrictMapper {
    @Override
    public District toDistrict(DistrictDto districtDto) {
        District district = new District();
        district.setId(districtDto.getId());
        district.setCity_village_id(districtDto.getCity_village_id());
        district.setName(districtDto.getName());
        return district;
    }

    @Override
    public DistrictDto toDistrictDto(District district) {
        DistrictDto districtDto = new DistrictDto();
        districtDto.setId(district.getId());
        districtDto.setCity_village_id(district.getCity_village_id());
        districtDto.setName(district.getName());
        return districtDto;
    }
}
