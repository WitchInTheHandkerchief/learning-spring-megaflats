package com.example.megaflats.mappers.impl;

import com.example.megaflats.mappers.RequestsMapper;
import com.example.megaflats.models.dto.RequestsDto;
import com.example.megaflats.models.entities.Requests;
import org.springframework.stereotype.Service;

@Service
public class RequestsMapperImpl implements RequestsMapper {
    @Override
    public Requests toRequests(RequestsDto requestsDto) {
        return null;
    }

    @Override
    public RequestsDto toRequestsDto(Requests requests) {
        return null;
    }
}
