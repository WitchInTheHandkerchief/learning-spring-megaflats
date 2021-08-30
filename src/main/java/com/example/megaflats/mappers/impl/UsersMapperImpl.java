package com.example.megaflats.mappers.impl;

import com.example.megaflats.mappers.UsersMapper;
import com.example.megaflats.models.dto.UsersDto;
import com.example.megaflats.models.entities.Users;
import org.springframework.stereotype.Service;

@Service
public class UsersMapperImpl implements UsersMapper {
    @Override
    public Users toUsers(UsersDto usersDto) {
        return null;
    }

    @Override
    public UsersDto toUsersDto(Users users) {
        return null;
    }
}
