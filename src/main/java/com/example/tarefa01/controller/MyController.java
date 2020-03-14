package com.example.tarefa01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * MyController
 */
@Controller
public class MyController {

    @GetMapping("/hello")

    public String Hello()
    {
        return "view";
    }
}