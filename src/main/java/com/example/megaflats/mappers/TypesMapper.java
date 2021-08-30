package com.example.megaflats.mappers;

import com.example.megaflats.models.dto.TypesDto;
import com.example.megaflats.models.entities.Types;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TypesMapper {
    TypesMapper INSTANCE = Mappers.getMapper(TypesMapper.class);

    Types toTypes(TypesDto typesDto);

    TypesDto toTypesDto(Types types);
}
