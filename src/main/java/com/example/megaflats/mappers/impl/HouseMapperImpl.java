package com.example.megaflats.mappers.impl;

import com.example.megaflats.mappers.HouseMapper;
import com.example.megaflats.models.dto.HouseDto;
import com.example.megaflats.models.entities.House;
import org.springframework.stereotype.Service;

@Service
public class HouseMapperImpl implements HouseMapper {
    @Override
    public House toHouse(HouseDto houseDto) {
        House house = new House();
        house.setId(houseDto.getId());
        house.setRooms(houseDto.getRooms());
        house.setDescription(houseDto.getDescription());
        house.setFloor(houseDto.getFloor());
        house.setArea(houseDto.getArea());
        house.setPrice(houseDto.getPrice());
        house.setTypes_id(houseDto.getTypes_id());
        house.setInternet(houseDto.isInternet());
        house.setFurniture(houseDto.isFurniture());
        house.setUsers_id(houseDto.getUsers_id());
        house.setCity_village_id(houseDto.getCity_village_id());
        house.setDistrict_id(houseDto.getDistrict_id());
        house.setAdd_date(houseDto.getAdd_date());
        house.setEdit_date(houseDto.getEdit_date());
        house.setLat(houseDto.getLat());
        house.setLon(houseDto.getLon());
        house.setAddress(houseDto.getAddress());
        return house;
    }

    @Override
    public HouseDto toHouseDto(House house) {
        HouseDto houseDto = new HouseDto();
        houseDto.setId(house.getId());
        houseDto.setRooms(house.getRooms());
        houseDto.setDescription(house.getDescription());
        houseDto.setFloor(house.getFloor());
        houseDto.setArea(house.getArea());
        houseDto.setPrice(house.getPrice());
        houseDto.setTypes_id(house.getTypes_id());
        houseDto.setInternet(house.isInternet());
        houseDto.setFurniture(house.isFurniture());
        houseDto.setUsers_id(house.getUsers_id());
        houseDto.setCity_village_id(house.getCity_village_id());
        houseDto.setDistrict_id(house.getDistrict_id());
        houseDto.setAdd_date(house.getAdd_date());
        houseDto.setEdit_date(house.getEdit_date());
        houseDto.setLat(house.getLat());
        houseDto.setLon(house.getLon());
        houseDto.setAddress(house.getAddress());
        return houseDto;
    }
}
