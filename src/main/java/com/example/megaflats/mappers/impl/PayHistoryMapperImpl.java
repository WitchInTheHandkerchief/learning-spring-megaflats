package com.example.megaflats.mappers.impl;

import com.example.megaflats.mappers.PayHistoryMapper;
import com.example.megaflats.models.dto.PayHistoryDto;
import com.example.megaflats.models.entities.PayHistory;
import org.springframework.stereotype.Service;

@Service
public class PayHistoryMapperImpl implements PayHistoryMapper {
    @Override
    public PayHistory toPayHistory(PayHistoryDto payHistoryDto) {
        return null;
    }

    @Override
    public PayHistoryDto toPayHistoryDto(PayHistory payHistory) {
        return null;
    }
}
