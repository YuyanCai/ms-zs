package com.caq.boot.service.Impl;

import com.caq.boot.mapper.UserMapper;
import com.caq.boot.pojo.User;
import com.caq.boot.service.Crud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrudImpl implements Crud {

    @Autowired
    UserMapper userMapper;

    @Override
    public User getAcc(String name, String age) {
        return userMapper.selectByNameAndAge(name,age);
    }

    @Override
    public void insertAcc(String name, int age, String email) {
        userMapper.insertUser(name,age,email);
    }

    @Override
    public void updateAcc(String name, int age, String email,int id) {
        userMapper.updateUser(name, age, email, id);
    }

    @Override
    public User selectById(int id) {
        return userMapper.SelectById(id);
    }

    @Override
    public void deleteUserById(int id) {
        userMapper.deleteUser(id);
    }

    @Override
    public List<User> listAllAcc() {
        return userMapper.selectAll();
    }

}
