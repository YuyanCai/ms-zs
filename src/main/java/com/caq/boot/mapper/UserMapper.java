package com.caq.boot.mapper;

import com.caq.boot.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author Jack
* @description 针对表【user】的数据库操作Mapper
* @createDate 2022-03-01 09:08:01
* @Entity com.caq.boot.pojo.User
*/
@Mapper
public interface UserMapper {

    List<User> selectAll();

    User selectByNameAndAge(String name,String age);

    void insertUser(String name, int age, String email);

    void updateUser(String name, int age, String email,int id);

    User SelectById(int id);

    void deleteUser(int id);

}




