package com.comp.stereotype_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyCompApp {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class);

        Java j1 = container.getBean(Java.class);
        j1.getTeachingHours();

        Selenium s1 = container.getBean(Selenium.class);
        s1.getTeachingHours();


    }
}
