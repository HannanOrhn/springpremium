package com.comp.bean_annotation.bean_practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Config2 {
    @Bean
    @Primary
    public String string(){
        return "Welcome to my life Hannan!";
    }
    @Bean(name = "str2")
    public String string2(){
        return "Welcome to my life everyone!";
    }
    @Bean
    public Integer integer(){
        return 28;
    }
//    @Bean
//    public Hannan hannan(){
//        return new Hannan();
//    }
}
