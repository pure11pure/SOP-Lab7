package com.example.lab7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class Lab7Application {

    public static void main(String[] args) {
        SpringApplication.run(Lab7Application.class, args);
    }

}
