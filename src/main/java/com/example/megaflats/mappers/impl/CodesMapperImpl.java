package com.example.megaflats.mappers.impl;

import com.example.megaflats.mappers.CodesMapper;
import com.example.megaflats.models.dto.CodesDto;
import com.example.megaflats.models.entities.Codes;
import org.springframework.stereotype.Service;

@Service
public class CodesMapperImpl implements CodesMapper {
    @Override
    public Codes toCodes(CodesDto codesDto) {
        return null;
    }

    @Override
    public CodesDto toCodesDto(Codes codes) {
        return null;
    }
}
