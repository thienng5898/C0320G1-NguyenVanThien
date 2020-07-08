package com.codegym.casestudyjavawbe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class CaseStudyJavaWbeApplication {

    public static void main(String[] args) {
        SpringApplication.run(CaseStudyJavaWbeApplication.class, args);
    }

}
