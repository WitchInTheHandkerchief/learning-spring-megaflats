package com.example.megaflats.service.impl;

import com.example.megaflats.dao.CodesRepo;
import com.example.megaflats.mappers.CodesMapper;
import com.example.megaflats.service.CodesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CodesServiceImpl implements CodesService {

    @Autowired
    private CodesMapper codesMapper;

    @Autowired
    private CodesRepo codesRepo;
}
