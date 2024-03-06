package com.comp.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyCompApp {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class, ConfigAny.class);

        FullTimeMentor fm = container.getBean(FullTimeMentor.class);
        fm.createAccount();

        PartTimeMentor pm = container.getBean(PartTimeMentor.class);
        pm.createAccount();
    }
}
