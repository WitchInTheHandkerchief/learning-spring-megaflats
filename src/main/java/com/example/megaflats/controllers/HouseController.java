package com.example.megaflats.controllers;

import com.example.megaflats.models.dto.HouseDto;
import com.example.megaflats.models.entities.House;
import com.example.megaflats.models.recievers.HouseReciever;
import com.example.megaflats.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/house")
public class HouseController {

    @Autowired
    private HouseService houseService;

    @PostMapping("/saveflat")
    public void saveHouse(@RequestBody HouseReciever houseReciever){
        houseService.savehouse(houseReciever);
    }
}
