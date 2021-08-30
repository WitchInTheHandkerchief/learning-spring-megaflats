package com.example.megaflats.mappers;

import com.example.megaflats.models.dto.DistrictDto;
import com.example.megaflats.models.entities.District;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DistrictMapper {
    DistrictMapper INSTANCE = Mappers.getMapper(DistrictMapper.class);

    District toDistrict(DistrictDto districtDto);

    DistrictDto toDistrictDto(District district);
}
