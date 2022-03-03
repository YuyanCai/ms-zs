package com.caq.boot.controller;

import com.caq.boot.pojo.User;
import com.caq.boot.service.Impl.CrudImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @Autowired
    CrudImpl crud;

    //跳转到登录页
    @GetMapping({"/", "/login"})
    public String login() {
        return "login";
    }

    //提交表单进行验证
    @PostMapping("/login")
    public String index(@RequestParam("name") String name,
                        @RequestParam("age") String age,
                        HttpSession session,
                        Model model) {

        User acc = crud.getAcc(name,age);
        if (acc != null){
            session.setAttribute("login",acc);
            return "redirect:/index";
        }else {
            model.addAttribute("msg","账号或密码错误");
            return "login";
        }
    }

//    重定向后的判断
    @GetMapping("/index")
    public String index(HttpSession session,
                        Model model){
        Object login = session.getAttribute("login");
        if (login != null){
            return "index";
        }else {
            model.addAttribute("msg","请重新登录");
            return "login";
        }


    }
}
