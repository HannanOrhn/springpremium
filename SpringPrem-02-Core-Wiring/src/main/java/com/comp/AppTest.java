package com.comp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppTest {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(Config.class);

        Car c1 = container.getBean(Car.class);
        System.out.println("c1.getMake() = " + c1.getMake());

        Person p1 = container.getBean(Person.class);
        String name = p1.getName();
        System.out.println("person name = " + name);
        System.out.println("Persons car : " + p1.getCar().getMake());
    }
}
