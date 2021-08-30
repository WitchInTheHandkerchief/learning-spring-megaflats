package com.example.megaflats.mappers.impl;

import com.example.megaflats.mappers.CodesMapper;
import com.example.megaflats.models.dto.CodesDto;
import com.example.megaflats.models.entities.Codes;
import org.springframework.stereotype.Service;

@Service
public class CodesMapperImpl implements CodesMapper {
    @Override
    public Codes toCodes(CodesDto codesDto) {
        Codes codes = new Codes();
        codes.setId(codesDto.getId());
        codes.setCode(codesDto.getCode());
        codes.setStart_date(codesDto.getStart_date());
        codes.setEnd_date(codesDto.getEnd_date());
        codes.setCode_status(codesDto.getCode_status());
        codes.setUsers_id(codesDto.getUsers_id());
        return codes;
    }

    @Override
    public CodesDto toCodesDto(Codes codes) {
        CodesDto codesDto = new CodesDto();
        codesDto.setId(codes.getId());
        codesDto.setCode(codes.getCode());
        codesDto.setStart_date(codes.getStart_date());
        codesDto.setEnd_date(codes.getEnd_date());
        codesDto.setCode_status(codes.getCode_status());
        codesDto.setUsers_id(codes.getUsers_id());
        return codesDto;
    }
}
