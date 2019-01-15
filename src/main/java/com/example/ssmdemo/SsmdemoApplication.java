package com.example.ssmdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SsmdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SsmdemoApplication.class, args);
    }

}

