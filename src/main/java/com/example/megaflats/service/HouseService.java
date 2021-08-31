package com.example.megaflats.service;

import com.example.megaflats.models.dto.HouseDto;
import com.example.megaflats.models.recievers.HouseReciever;
import org.springframework.stereotype.Service;

@Service
public interface HouseService {
    HouseDto savehouse(HouseReciever houseReciever);
}
