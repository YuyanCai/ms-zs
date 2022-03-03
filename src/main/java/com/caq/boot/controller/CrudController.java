package com.caq.boot.controller;

import com.caq.boot.pojo.User;
import com.caq.boot.service.Impl.CrudImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class CrudController {

    @Autowired
    CrudImpl crud;

    @GetMapping("tables")
    public String listAll(Model model,
                          HttpSession session) {
        if (session.getAttribute("login") != null){
            List<User> users = crud.listAllAcc();
            model.addAttribute("listUsers", users);
            return "tables";
        }else {
            model.addAttribute("msg","请先登录");
            return "login";
        }
    }

    @GetMapping("insert_page")
    public String insert(){
        return "insert_page";
    }

    @PostMapping("insert_page")
    public String insertAcc(@RequestParam("name") String name,
                            @RequestParam("age") int age,
                            @RequestParam("email") String email) {
        crud.insertAcc(name, age, email);
        return "redirect:/tables";
    }

    @GetMapping("update_page/{id}")
    public String update(@PathVariable("id") int id,
                         Model model){
        User user = crud.selectById(id);
        model.addAttribute("user",user);
        return "update_page";
    }

    @PostMapping("update_page")
    public String update(@RequestParam("name") String name,
                         @RequestParam("age") int age,
                         @RequestParam("email") String email,
                         @RequestParam("id") int id
                         ){
        crud.updateAcc(name,age,email,id);
        return "redirect:/tables";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id")int id){
        crud.deleteUserById(id);
        return "redirect:/tables";
    }
}
