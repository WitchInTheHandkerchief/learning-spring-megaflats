package com.example.megaflats.service.impl;

import com.example.megaflats.dao.UsersRepo;
import com.example.megaflats.exceptions.CustomException;
import com.example.megaflats.mappers.UsersMapper;
import com.example.megaflats.models.dto.UsersDto;
import com.example.megaflats.models.entities.Users;
import com.example.megaflats.service.CodesService;
import com.example.megaflats.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersRepo usersRepo;

    @Autowired
    private UsersMapper usersMapper;

    @Autowired
    private CodesService codesService;

    @Override
    public UsersDto saveUser(Long phone) {
        if (usersRepo.findUsersByPhone(phone)==null){
            Users users = new Users();
            users.setPhone(phone);
            codesService.createCode(usersMapper.toUsersDto(users));
            return usersMapper.toUsersDto(users);
        }else {
            throw new CustomException("phone exists");
        }
    }
}
