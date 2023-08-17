package com.tutorial.poc.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.HashMap;

@Configuration
public class PocConfiguration {

    @Bean(name = "helper")
    Helper getHelper() {
        return new Helper();
    }

/*    @Bean
    public WebMvcConfigurer corsConfigurer() {

        return new WebMvcConfigurer() {
          @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/greeting-javaconfig").allowedOrigins("http://localhost:8080");
            }
        };
    }*/


}
