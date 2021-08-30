package com.example.megaflats.mappers.impl;

import com.example.megaflats.mappers.TypesMapper;
import com.example.megaflats.models.dto.TypesDto;
import com.example.megaflats.models.entities.Types;
import org.springframework.stereotype.Service;

@Service
public class TypesMapperImpl implements TypesMapper {
    @Override
    public Types toTypes(TypesDto typesDto) {
        return null;
    }

    @Override
    public TypesDto toTypesDto(Types types) {
        return null;
    }
}
