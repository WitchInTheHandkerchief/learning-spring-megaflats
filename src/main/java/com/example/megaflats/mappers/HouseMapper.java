package com.example.megaflats.mappers;

import com.example.megaflats.models.dto.HouseDto;
import com.example.megaflats.models.entities.House;
import com.example.megaflats.models.recievers.HouseReciever;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface HouseMapper {
    HouseMapper INSTANCE = Mappers.getMapper(HouseMapper.class);

    House toHouse(HouseDto houseDto);

    HouseDto toHouseDto(House house);

    HouseDto toHouseDtoFromReciever(HouseReciever houseReciever);
}
