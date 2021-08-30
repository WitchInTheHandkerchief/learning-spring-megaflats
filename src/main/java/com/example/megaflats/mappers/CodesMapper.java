package com.example.megaflats.mappers;

import com.example.megaflats.models.dto.CodesDto;
import com.example.megaflats.models.entities.Codes;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CodesMapper {
    CodesMapper INSTANCE = Mappers.getMapper(CodesMapper.class);

    Codes toCodes(CodesDto codesDto);

    CodesDto toCodesDto(Codes codes);
}
