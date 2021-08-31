package com.example.megaflats.service.impl;

import com.example.megaflats.dao.ImagesRepo;
import com.example.megaflats.mappers.ImagesMapper;
import com.example.megaflats.service.ImagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImagesServiceImpl implements ImagesService {

    @Autowired
    private ImagesMapper imagesMapper;

    @Autowired
    private ImagesRepo imagesRepo;
}
