package com.example.megaflats.controllers;

import com.example.megaflats.service.CodesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/codes")
public class CodesController {

    @Autowired
    private CodesService codesService;

    @PostMapping("/entercode")
    public void enterCode(@RequestParam Long code, Long user_id){
        codesService.enterCode(code, user_id);
    }
}
