package com.example.megaflats.mappers.impl;

import com.example.megaflats.mappers.ImagesMapper;
import com.example.megaflats.models.dto.ImagesDto;
import com.example.megaflats.models.entities.Images;
import org.springframework.stereotype.Service;

@Service
public class ImagesMapperImpl implements ImagesMapper {
    @Override
    public Images toImages(ImagesDto imagesDto) {
        return null;
    }

    @Override
    public ImagesDto toImagesDto(Images images) {
        return null;
    }
}
