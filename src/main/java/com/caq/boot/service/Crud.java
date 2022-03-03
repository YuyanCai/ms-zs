package com.caq.boot.service;

import com.caq.boot.pojo.User;

import java.util.List;

public interface Crud {

    //登录用户
    User getAcc(String name, String age);

    //查看所有用户
    List<User> listAllAcc();

    //注册，新建用户
    void insertAcc(String name, int age, String email);

    //修改用户
    void updateAcc(String name, int age, String email, int id);

    //按照id查找用户
    User selectById(int id);

    //根据id删除用户
    void deleteUserById(int id);

}
