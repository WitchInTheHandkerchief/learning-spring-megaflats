package com.example.megaflats.service.impl;

import com.example.megaflats.dao.DistrictRepo;
import com.example.megaflats.mappers.DistrictMapper;
import com.example.megaflats.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DistrictServiceImpl implements DistrictService {

    @Autowired
    private DistrictRepo districtRepo;

    @Autowired
    private DistrictMapper districtMapper;
}
