package com.phealy1982;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class PoolLeagueAPI {

    public static final String PATH_REGEX = "/api/.*";

    public static void main(String[] args) {
        SpringApplication.run(PoolLeagueAPI.class, args);


        System.out.println("Pool League API started.");
    }

}
