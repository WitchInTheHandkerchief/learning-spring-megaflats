package com.example.megaflats.service.impl;

import com.example.megaflats.dao.RequestsRepo;
import com.example.megaflats.mappers.RequestsMapper;
import com.example.megaflats.service.RequestsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RequestsServiceImpl implements RequestsService {

    @Autowired
    private RequestsMapper requestsMapper;

    @Autowired
    private RequestsRepo requestsRepo;
}
