package com.example.megaflats.mappers.impl;

import com.example.megaflats.mappers.ReserveHistoryMapper;
import com.example.megaflats.models.dto.ReserveHistoryDto;
import com.example.megaflats.models.entities.ReserveHistory;
import org.springframework.stereotype.Service;

@Service
public class ReserveHistoryMapperImpl implements ReserveHistoryMapper {
    @Override
    public ReserveHistory toReserveHistory(ReserveHistoryDto reserveHistoryDto) {
        ReserveHistory reserveHistory = new ReserveHistory();
        reserveHistory.setId(reserveHistoryDto.getId());
        reserveHistory.setHouse_id(reserveHistoryDto.getHouse_id());
        reserveHistory.setUsers_id(reserveHistoryDto.getUsers_id());
        reserveHistory.setStart_date(reserveHistoryDto.getStart_date());
        reserveHistory.setEnd_date(reserveHistoryDto.getEnd_date());
        reserveHistory.setStatus(reserveHistoryDto.getStatus());
        reserveHistory.setTotal_price(reserveHistoryDto.getTotal_price());
        reserveHistory.setAdd_date(reserveHistoryDto.getAdd_date());
        reserveHistory.setEdit_date(reserveHistoryDto.getEdit_date());
        return reserveHistory;
    }

    @Override
    public ReserveHistoryDto toReserveHistoryDto(ReserveHistory reserveHistory) {
        ReserveHistoryDto reserveHistoryDto = new ReserveHistoryDto();
        reserveHistoryDto.setId(reserveHistory.getId());
        reserveHistoryDto.setHouse_id(reserveHistory.getHouse_id());
        reserveHistoryDto.setUsers_id(reserveHistory.getUsers_id());
        reserveHistoryDto.setStart_date(reserveHistory.getStart_date());
        reserveHistoryDto.setEnd_date(reserveHistory.getEnd_date());
        reserveHistoryDto.setStatus(reserveHistory.getStatus());
        reserveHistoryDto.setTotal_price(reserveHistory.getTotal_price());
        reserveHistoryDto.setAdd_date(reserveHistory.getAdd_date());
        reserveHistoryDto.setEdit_date(reserveHistory.getEdit_date());
        return reserveHistoryDto;
    }
}
