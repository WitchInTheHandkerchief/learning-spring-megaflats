package com.example.megaflats.service.impl;

import com.example.megaflats.dao.PayHistoryRepo;
import com.example.megaflats.mappers.PayHistoryMapper;
import com.example.megaflats.service.PayHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayHistoryServiceImpl implements PayHistoryService {

    @Autowired
    private PayHistoryMapper payHistoryMapper;

    @Autowired
    private PayHistoryRepo payHistoryRepo;
}
