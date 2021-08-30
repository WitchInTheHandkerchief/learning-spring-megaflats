package com.example.megaflats.mappers;

import com.example.megaflats.models.dto.ImagesDto;
import com.example.megaflats.models.entities.Images;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ImagesMapper {
    ImagesMapper INSTANCE = Mappers.getMapper(ImagesMapper.class);

    Images toImages(ImagesDto imagesDto);

    ImagesDto toImagesDto(Images images);
}
