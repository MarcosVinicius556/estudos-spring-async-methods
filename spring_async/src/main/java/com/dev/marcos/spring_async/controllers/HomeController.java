package com.dev.marcos.spring_async.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.marcos.spring_async.services.TaskService;

@RestController
@RequestMapping("/home")
@EnableAsync //Habilita o uso de métodos assíncronos dentro desta classe
public class HomeController {
    
    @Autowired
    private TaskService taskService;
    
    @GetMapping
    public String execute() throws InterruptedException {
        long l = System.currentTimeMillis();

        taskService.execute();

        long f = System.currentTimeMillis();
        return String.valueOf(l - f);
    }

}
