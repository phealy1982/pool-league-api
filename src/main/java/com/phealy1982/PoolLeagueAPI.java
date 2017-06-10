package com.phealy1982;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration @ComponentScan @EnableAutoConfiguration @EnableSwagger2 public class PoolLeagueAPI {

    public static final String PATH_REGEX = "/api/.*";

    public static void main(String[] args) {
        SpringApplication.run(PoolLeagueAPI.class, args);


        System.out.println("Pool League API started.");
    }

    @Bean public Docket swaggerSettings() {
        return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.any())
            .paths(PathSelectors.regex(PATH_REGEX)).build().pathMapping("/");
    }

}
