package com.example.megaflats.service;

import com.example.megaflats.models.dto.CodesDto;
import com.example.megaflats.models.dto.UsersDto;
import com.example.megaflats.models.enums.CodeStatus;
import org.springframework.stereotype.Service;

@Service
public interface CodesService {
    void enterCode(Long code, Long user_id);
    void createCode(UsersDto usersDto);
    CodesDto findCode(Long user_id, CodeStatus codeStatus);
}
