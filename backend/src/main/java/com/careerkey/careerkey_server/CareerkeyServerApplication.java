package com.careerkey.careerkey_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.careerkey.careerkey_server.repos")
@EntityScan(basePackages = "com.careerkey.careerkey_server.entity")
public class CareerkeyServerApplication {

    public static void main(final String[] args) {
        SpringApplication.run(CareerkeyServerApplication.class, args);
    }

}
