package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.ZonedDateTime;

//@SpringBootApplication
public class Main {

    public static void main(String[] args) {
//        SpringApplication.run(Main.class, args);
        ZonedDateTime zbj = ZonedDateTime.now();
        System.out.println(zbj);
    }

}
