package com.example.helloworld.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class HelloworldApplication {

    public static void main(String[] args) {
//        System.out.println(System.getProperty("java.version"));
        SpringApplication.run(HelloworldApplication.class, args);
    }

}
