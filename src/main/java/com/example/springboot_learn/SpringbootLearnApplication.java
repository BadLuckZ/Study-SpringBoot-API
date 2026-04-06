package com.example.springboot_learn;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootLearnApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootLearnApplication.class, args);
    }

    @Bean
    // Log ที่จะแสดงทันทีหลังจากที่ run server สำเร็จ
    public CommandLineRunner commandLineRunner(String[] args) {
        return runner->{
            System.out.println("Running this server at localhost:8080");
        };
    }
}
