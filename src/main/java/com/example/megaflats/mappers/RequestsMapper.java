package com.example.megaflats.mappers;

import com.example.megaflats.models.dto.RequestsDto;
import com.example.megaflats.models.entities.Requests;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RequestsMapper {
    RequestsMapper INSTANCE = Mappers.getMapper(RequestsMapper.class);

    Requests toRequests(RequestsDto requestsDto);

    RequestsDto toRequestsDto(Requests requests);
}
