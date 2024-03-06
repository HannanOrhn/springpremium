package com.comp.bean_annotation;

import org.springframework.context.annotation.Bean;

public class ConfigAny {
    @Bean
    String str(){
        return "Developer";
    }

    Integer number(){
        return 10;
    }
}
