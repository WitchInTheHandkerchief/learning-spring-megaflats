package com.example.megaflats.service.impl;

import com.example.megaflats.dao.ReserveHistoryRepo;
import com.example.megaflats.mappers.ReserveHistoryMapper;
import com.example.megaflats.service.ReserveHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReserveHistoryServiceImpl implements ReserveHistoryService {

    @Autowired
    private ReserveHistoryMapper reserveHistoryMapper;

    @Autowired
    private ReserveHistoryRepo reserveHistoryRepo;
}
