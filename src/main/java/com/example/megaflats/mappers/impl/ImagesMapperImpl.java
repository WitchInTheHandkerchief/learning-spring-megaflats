package com.example.megaflats.mappers.impl;

import com.example.megaflats.mappers.ImagesMapper;
import com.example.megaflats.models.dto.ImagesDto;
import com.example.megaflats.models.entities.Images;
import org.springframework.stereotype.Service;

@Service
public class ImagesMapperImpl implements ImagesMapper {
    @Override
    public Images toImages(ImagesDto imagesDto) {
        Images images = new Images();
        images.setId(imagesDto.getId());
        images.setHouse_id(imagesDto.getHouse_id());
        images.setUrl(imagesDto.getUrl());
        images.setOrder_num(imagesDto.getOrder_num());
        return images;
    }

    @Override
    public ImagesDto toImagesDto(Images images) {
        ImagesDto imagesDto = new ImagesDto();
        imagesDto.setId(images.getId());
        imagesDto.setHouse_id(images.getHouse_id());
        imagesDto.setUrl(images.getUrl());
        imagesDto.setOrder_num(images.getOrder_num());
        return imagesDto;
    }
}
