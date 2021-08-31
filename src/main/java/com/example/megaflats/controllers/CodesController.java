package com.example.megaflats.controllers;

import com.example.megaflats.service.CodesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/codes")
public class CodesController {

    @Autowired
    private CodesService codesService;
}
