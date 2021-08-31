package com.example.megaflats.service.impl;

import com.example.megaflats.dao.*;
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

    @Autowired
    private TypesRepo typesRepo;

    @Autowired
    private UsersRepo usersRepo;

    @Autowired
    private CityVillageRepo cityVillageRepo;

    @Autowired
    private DistrictRepo districtRepo;

    @Override
    public HouseDto savehouse(HouseReciever houseReciever) {
        HouseDto houseDto = houseMapper.toHouseDtoFromReciever(houseReciever);
        houseDto.setDistrict_id(districtRepo.findDistrictById(houseReciever.getDistrict_id()));
        houseDto.setCity_village_id(cityVillageRepo.findCityVillageById(houseReciever.getCity_village_id()));
        houseDto.setUsers_id(usersRepo.findUsersById(houseReciever.getUsers_id()));
        houseDto.setTypes_id(typesRepo.findTypesById(houseReciever.getTypes_id()));
        House house = houseMapper.toHouse(houseDto);
        houseRepo.save(house);
        return houseMapper.toHouseDto(house);
    }
}
