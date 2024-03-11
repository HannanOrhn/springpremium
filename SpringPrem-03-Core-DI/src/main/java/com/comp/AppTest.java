package com.comp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppTest {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(Config.class);

        //first way of dependency injection
        Java java1 = container.getBean(Java.class);
        java1.getTeachingHours(); //we need @AutoWired annotation otherwise it gives NullPointerException

        //second way of dependency injection
        Selenium selenium1 = container.getBean(Selenium.class);
        selenium1.getTeachingHours();
    }
}
