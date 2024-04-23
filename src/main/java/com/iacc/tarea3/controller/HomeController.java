package com.iacc.tarea3.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class HomeController {

    @GetMapping({"/", "index.html"})
    public String showHome() {
        return "index";
    }
}
