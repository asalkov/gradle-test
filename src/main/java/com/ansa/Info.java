package com.ansa;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:config/application.properties")
public class Info {
    @Value("${application.name}")
    private String value;

    @Bean
    public Obj obj(){
        return new Obj(value);
    }

}
