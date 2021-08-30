package com.example.megaflats.mappers.impl;

import com.example.megaflats.mappers.RequestsMapper;
import com.example.megaflats.models.dto.RequestsDto;
import com.example.megaflats.models.entities.Requests;
import org.springframework.stereotype.Service;

@Service
public class RequestsMapperImpl implements RequestsMapper {
    @Override
    public Requests toRequests(RequestsDto requestsDto) {
        Requests requests = new Requests();
        requests.setId(requestsDto.getId());
        requests.setAdd_date(requestsDto.getAdd_date());
        requests.setSuccess(requestsDto.isSuccess());
        requests.setCodes_id(requestsDto.getCodes_id());
        return requests;
    }

    @Override
    public RequestsDto toRequestsDto(Requests requests) {
        RequestsDto requestsDto = new RequestsDto();
        requestsDto.setId(requests.getId());
        requestsDto.setAdd_date(requests.getAdd_date());
        requestsDto.setSuccess(requests.isSuccess());
        requestsDto.setCodes_id(requests.getCodes_id());
        return requestsDto;
    }
}
