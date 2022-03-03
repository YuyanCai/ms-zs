package com.caq.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TableController {

    @GetMapping("/tables.html")
    public String tables(){
        return "tables";
    }
}
