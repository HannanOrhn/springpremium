package com.comp.stereotype_annotation.practice.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "com.comp.practice")
@Configuration
public class AppConfig {
}
