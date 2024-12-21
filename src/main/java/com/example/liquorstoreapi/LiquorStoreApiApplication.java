package com.example.liquorstoreapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.example.liquorstoreapi.Repositorios")
@EntityScan("com.example.liquorstoreapi.Clases")
public class LiquorStoreApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(LiquorStoreApiApplication.class, args);
    }

}
