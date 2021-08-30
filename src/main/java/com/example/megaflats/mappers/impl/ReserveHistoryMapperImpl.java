package com.example.megaflats.mappers.impl;

import com.example.megaflats.mappers.ReserveHistoryMapper;
import com.example.megaflats.models.dto.ReserveHistoryDto;
import com.example.megaflats.models.entities.ReserveHistory;
import org.springframework.stereotype.Service;

@Service
public class ReserveHistoryMapperImpl implements ReserveHistoryMapper {
    @Override
    public ReserveHistory toReserveHistory(ReserveHistoryDto reserveHistoryDto) {
        return null;
    }

    @Override
    public ReserveHistoryDto toReserveHistoryDto(ReserveHistory reserveHistory) {
        return null;
    }
}
