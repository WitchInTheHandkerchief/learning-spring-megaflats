package com.example.megaflats.mappers.impl;

import com.example.megaflats.mappers.UsersMapper;
import com.example.megaflats.models.dto.UsersDto;
import com.example.megaflats.models.entities.Users;
import org.springframework.stereotype.Service;

@Service
public class UsersMapperImpl implements UsersMapper {
    @Override
    public Users toUsers(UsersDto usersDto) {
        Users users = new Users();
        users.setId(usersDto.getId());
        users.setPhone(usersDto.getPhone());
        users.setBlock_date(usersDto.getBlock_date());
        return users;
    }

    @Override
    public UsersDto toUsersDto(Users users) {
        UsersDto usersDto = new UsersDto();
        usersDto.setId(users.getId());
        usersDto.setPhone(users.getPhone());
        usersDto.setBlock_date(users.getBlock_date());
        return usersDto;
    }
}
