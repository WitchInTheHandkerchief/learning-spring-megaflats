package com.example.megaflats.service.impl;

import com.example.megaflats.dao.UsersRepo;
import com.example.megaflats.mappers.UsersMapper;
import com.example.megaflats.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersRepo usersRepo;

    @Autowired
    private UsersMapper usersMapper;
}
