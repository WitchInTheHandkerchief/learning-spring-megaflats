package com.example.megaflats.service.impl;

import com.example.megaflats.dao.RegionsRepo;
import com.example.megaflats.mappers.RegionsMapper;
import com.example.megaflats.service.RegionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegionsServiceImpl implements RegionsService {

    @Autowired
    private RegionsMapper regionsMapper;

    @Autowired
    private RegionsRepo regionsRepo;
}
