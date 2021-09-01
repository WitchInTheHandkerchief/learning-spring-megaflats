package com.example.megaflats.service;

import com.example.megaflats.models.dto.UsersDto;
import org.springframework.stereotype.Service;

@Service
public interface UsersService {
    UsersDto saveUser(Long phone);
}
