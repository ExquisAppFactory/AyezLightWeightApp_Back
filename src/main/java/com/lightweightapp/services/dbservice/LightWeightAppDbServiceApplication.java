package com.lightweightapp.services.dbservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.lightweightapp.services.dbservice.repository")
@SpringBootApplication
public class LightWeightAppDbServiceApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(LightWeightAppDbServiceApplication.class, args);
    }

}