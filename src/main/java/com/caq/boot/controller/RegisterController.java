package com.caq.boot.controller;

import com.caq.boot.service.Impl.CrudImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class RegisterController {
    @Autowired
    CrudImpl crud;

    @GetMapping("register")
    public String register(){
        return "register";
    }

    @PostMapping("register")
    public String submit(@RequestParam("name") String name,
                         @RequestParam("age") int age,
                         @RequestParam("email") String email
    ){

        crud.insertAcc(name,age,email);
        return "redirect:/login.html";
    }

    @GetMapping("/login.html")
    public String login(){
        return "login";
    }
}
