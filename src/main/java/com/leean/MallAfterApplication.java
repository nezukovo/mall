package com.leean;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.leean.mapper")
public class MallAfterApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallAfterApplication.class, args);
    }

}
