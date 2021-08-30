package com.example.megaflats.mappers.impl;

import com.example.megaflats.mappers.TypesMapper;
import com.example.megaflats.models.dto.TypesDto;
import com.example.megaflats.models.entities.Types;
import org.springframework.stereotype.Service;

@Service
public class TypesMapperImpl implements TypesMapper {
    @Override
    public Types toTypes(TypesDto typesDto) {
        Types types = new Types();
        types.setId(typesDto.getId());
        types.setName(typesDto.getName());
        types.setActive(typesDto.isActive());
        return types;
    }

    @Override
    public TypesDto toTypesDto(Types types) {
        TypesDto typesDto = new TypesDto();
        typesDto.setId(types.getId());
        typesDto.setName(types.getName());
        typesDto.setActive(types.isActive());
        return typesDto;
    }
}
