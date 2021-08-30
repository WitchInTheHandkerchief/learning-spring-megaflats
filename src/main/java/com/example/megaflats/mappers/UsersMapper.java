package com.example.megaflats.mappers;

import com.example.megaflats.models.dto.UsersDto;
import com.example.megaflats.models.entities.Users;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UsersMapper {
    UsersMapper INSTANCE = Mappers.getMapper(UsersMapper.class);

    Users toUsers(UsersDto usersDto);

    UsersDto toUsersDto(Users users);
}
