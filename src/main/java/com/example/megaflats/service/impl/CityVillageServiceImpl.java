package com.example.megaflats.service.impl;

import com.example.megaflats.dao.CityVillageRepo;
import com.example.megaflats.mappers.CityVillageMapper;
import com.example.megaflats.service.CityVillageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityVillageServiceImpl implements CityVillageService {

    @Autowired
    private CityVillageRepo cityVillageRepo;

    @Autowired
    private CityVillageMapper cityVillageMapper;
}
