package com.comp.stereotype_annotation.practice;

import com.comp.stereotype_annotation.practice.config.AppConfig;
import com.comp.stereotype_annotation.practice.model.DataStructure;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppTest {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);

        DataStructure dataStructure = container.getBean(DataStructure.class);
        dataStructure.getTotalHours();

    }
}
