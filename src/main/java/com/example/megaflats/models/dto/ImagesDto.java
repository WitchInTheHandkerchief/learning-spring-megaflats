package com.example.megaflats.models.dto;

import com.example.megaflats.models.entities.House;
import lombok.Data;

@Data
public class ImagesDto {
    private Long id;

    private House house_id;

    private String url;

    private int order_num;
}
