package com.example.megaflats.service.impl;

import com.example.megaflats.dao.HouseRepo;
import com.example.megaflats.mappers.HouseMapper;
import com.example.megaflats.models.dto.HouseDto;
import com.example.megaflats.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HouseServiceImpl implements HouseService {

    @Autowired
    private HouseMapper houseMapper;

    @Autowired
    private HouseRepo houseRepo;
}
