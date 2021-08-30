package com.example.megaflats.mappers;

import com.example.megaflats.models.dto.ReserveHistoryDto;
import com.example.megaflats.models.entities.ReserveHistory;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ReserveHistoryMapper {
    ReserveHistoryMapper INSTANCE = Mappers.getMapper(ReserveHistoryMapper.class);

    ReserveHistory toReserveHistory(ReserveHistoryDto reserveHistoryDto);

    ReserveHistoryDto toReserveHistoryDto(ReserveHistory reserveHistory);
}
