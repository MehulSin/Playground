package com.example.ManufacturerDetail.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class config {

    @Bean
    public RestTemplate rest() {
        return new RestTemplate();
    }
}
