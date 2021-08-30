package com.example.megaflats.mappers;

import com.example.megaflats.models.dto.PayHistoryDto;
import com.example.megaflats.models.entities.PayHistory;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PayHistoryMapper {
    PayHistoryMapper INSTANCE = Mappers.getMapper(PayHistoryMapper.class);

    PayHistory toPayHistory(PayHistoryDto payHistoryDto);

    PayHistoryDto toPayHistoryDto(PayHistory payHistory);
}
