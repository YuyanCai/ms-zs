package com.caq.boot;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.caq.boot.mapper")
public class SysAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(SysAdminApplication.class, args);
    }

}
