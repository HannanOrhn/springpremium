package com.comp.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyCompApp {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class, ConfigAny.class);

        FullTimeMentor fm = container.getBean(FullTimeMentor.class);
        fm.createAccount();

//        PartTimeMentor pm1 = container.getBean("p1",PartTimeMentor.class);
//        pm1.createAccount();

//        PartTimeMentor pm2 = container.getBean("p2",PartTimeMentor.class);
//        pm2.createAccount();

        //or we can use @Primary annotation

        PartTimeMentor pm = container.getBean(PartTimeMentor.class);
        pm.createAccount();

        String str = container.getBean(String.class);
        System.out.println(str);
    }
}
