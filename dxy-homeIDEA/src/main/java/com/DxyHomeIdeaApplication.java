package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com/mapper")
public class DxyHomeIdeaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DxyHomeIdeaApplication.class, args);
    }

}
