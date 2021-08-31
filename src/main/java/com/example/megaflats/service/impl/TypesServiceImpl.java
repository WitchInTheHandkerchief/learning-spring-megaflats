package com.example.megaflats.service.impl;

import com.example.megaflats.dao.TypesRepo;
import com.example.megaflats.mappers.TypesMapper;
import com.example.megaflats.service.TypesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TypesServiceImpl implements TypesService {

    @Autowired
    private TypesRepo typesRepo;

    @Autowired
    private TypesMapper typesMapper;
}
