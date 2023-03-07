package com.daytobackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class DaytoBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(DaytoBackendApplication.class, args);
    }

}
