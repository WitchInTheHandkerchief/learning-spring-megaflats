package com.example.megaflats.service.impl;

import com.example.megaflats.dao.CodesRepo;
import com.example.megaflats.dao.UsersRepo;
import com.example.megaflats.exceptions.CustomException;
import com.example.megaflats.mappers.CodesMapper;
import com.example.megaflats.mappers.UsersMapper;
import com.example.megaflats.models.dto.CodesDto;
import com.example.megaflats.models.dto.UsersDto;
import com.example.megaflats.models.entities.Codes;
import com.example.megaflats.models.enums.CodeStatus;
import com.example.megaflats.service.CodesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.rmi.AlreadyBoundException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;

@Service
public class CodesServiceImpl implements CodesService {

    private int counter = 0;

    @Autowired
    private CodesMapper codesMapper;

    @Autowired
    private CodesRepo codesRepo;

    @Autowired
    private CodesService codesService;

    @Autowired
    private UsersRepo usersRepo;

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public void enterCode(Long code, Long user_id) {
        CodesDto codesDto = new CodesDto();
        codesDto = codesService.findCode(user_id, CodeStatus.CANCELLED);
        Long user_code = codesRepo.findCodesByUsers_id(user_id).getCode();
        if (usersRepo.findUsersById(user_id)==null){
            throw new CustomException("no such user");
        }
        if (usersRepo.findUsersById(user_id).getBlock_date()!=null){
            throw new CustomException("user blocked");
        }
        if (code!=user_code){
            ++counter;
            codesDto.setCode_status(CodeStatus.FAILED);
            if(counter == 3){
                codesDto.setCode_status(CodeStatus.CANCELLED);
                codesRepo.save(codesMapper.toCodes(codesDto));
                throw new CustomException("code cancelled");
            }
            codesRepo.save(codesMapper.toCodes(codesDto));
            throw new CustomException("incorrect code");
        }
        codesDto.setCode_status(CodeStatus.APPROVED);
        codesRepo.save(codesMapper.toCodes(codesDto));
    }
    @Override
    public void createCode(UsersDto usersDto) {
        CodesDto codesDto = new CodesDto();
        LocalDateTime currentTime = LocalDateTime.now();
        codesDto.setCode_status(CodeStatus.NEW);
        codesDto.setStart_date(currentTime);
        codesDto.setEnd_date(currentTime.plusMinutes(2));
        codesDto.setCode((long)Math.random()*(9999-1000+1)+1000);
        codesDto.setUsers_id(usersMapper.toUsers(usersDto));
        codesRepo.save(codesMapper.toCodes(codesDto));
    }

    @Override
    public CodesDto findCode(Long user_id, CodeStatus codeStatus) {
        Codes codes = codesRepo.findCodesByUsers_id(user_id);
        if (codes.getCode_status().equals(CodeStatus.CANCELLED)){
            return codesMapper.toCodesDto(codes);
        }else {
            throw new CustomException("code is incorrect");
        }
    }
}
