package com.example.liquorstoreapi.Config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
