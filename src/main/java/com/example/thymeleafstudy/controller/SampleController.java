package com.example.thymeleafstudy.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/Sample")
public class SampleController{

    @GetMapping({"/exLayout1","/exLayout2","/exTemplate"})
    public void exLayout1(){
        log.info("exLayout..............");
    }

}