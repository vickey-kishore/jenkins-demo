package com.example.dummyservice;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Jenkin demo project
// youtube channel ---> https://www.youtube.com/watch?v=jkJgS3zDv9g
@SpringBootApplication
public class DummyServiceApplication {

    public static Logger logger = LoggerFactory.getLogger(DummyServiceApplication.class);

    @PostConstruct
    public void init() {
        logger.info("====> APPLICATION STARTED");
    }


    public static void main(String[] args) {
        logger.info("====> APPLICATION EXECUTED...");
        SpringApplication.run(DummyServiceApplication.class, args);
    }

}
