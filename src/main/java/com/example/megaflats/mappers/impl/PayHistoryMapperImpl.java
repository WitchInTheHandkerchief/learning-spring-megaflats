package com.example.megaflats.mappers.impl;

import com.example.megaflats.mappers.PayHistoryMapper;
import com.example.megaflats.models.dto.PayHistoryDto;
import com.example.megaflats.models.entities.PayHistory;
import org.springframework.stereotype.Service;

@Service
public class PayHistoryMapperImpl implements PayHistoryMapper {
    @Override
    public PayHistory toPayHistory(PayHistoryDto payHistoryDto) {
        PayHistory payHistory = new PayHistory();
        payHistory.setId(payHistoryDto.getId());
        payHistory.setReserve_history_id(payHistoryDto.getReserve_history_id());
        payHistory.setCash(payHistoryDto.getCash());
        payHistory.setAdd_date(payHistoryDto.getAdd_date());
        return payHistory;
    }

    @Override
    public PayHistoryDto toPayHistoryDto(PayHistory payHistory) {
        PayHistoryDto payHistoryDto = new PayHistoryDto();
        payHistoryDto.setId(payHistory.getId());
        payHistoryDto.setReserve_history_id(payHistory.getReserve_history_id());
        payHistoryDto.setCash(payHistory.getCash());
        payHistoryDto.setAdd_date(payHistory.getAdd_date());
        return payHistoryDto;
    }
}
