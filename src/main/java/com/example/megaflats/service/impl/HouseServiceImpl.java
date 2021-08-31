package com.example.megaflats.service.impl;

import com.example.megaflats.dao.HouseRepo;
import com.example.megaflats.mappers.HouseMapper;
import com.example.megaflats.models.dto.HouseDto;
import com.example.megaflats.models.entities.House;
import com.example.megaflats.models.recievers.HouseReciever;
import com.example.megaflats.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Access;

@Service
public class HouseServiceImpl implements HouseService {

    @Autowired
    private HouseMapper houseMapper;

    @Autowired
    private HouseRepo houseRepo;

    @Override
    public HouseDto savehouse(HouseReciever houseReciever) {
        HouseDto houseDto = houseMapper.toHouseDtoFromReciever(houseReciever);
        House house = houseMapper.toHouse(houseDto);
        houseRepo.save(house);
        return houseMapper.toHouseDto(house);
    }
}
