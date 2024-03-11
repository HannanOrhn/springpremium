package com.comp.bean_annotation.bean_practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppTest {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(Config.class);

        FullTimeMentor fullTimeMentor = container.getBean(FullTimeMentor.class);
        fullTimeMentor.createAccount();

        ApplicationContext container2 = new AnnotationConfigApplicationContext(Config.class, Config2.class);

        FullTimeMentor ft = container2.getBean(FullTimeMentor.class);
        ft.createAccount();

        String s = container2.getBean(String.class);
        System.out.println("s = " + s);

        String s2 = container2.getBean("str2",String.class);
        System.out.println("s2 = " + s2);
    }
}
