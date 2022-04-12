package com.enigma.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean
    Engine Gasoline(){
        return new Gasoline();
    }

    @Bean(name = "electrical")
    Engine Electric(){
        return new Electric();
    }
}
