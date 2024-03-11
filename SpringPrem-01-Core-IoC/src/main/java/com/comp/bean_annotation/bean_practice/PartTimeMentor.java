package com.comp.bean_annotation.bean_practice;

import org.springframework.stereotype.Component;

@Component
public class PartTimeMentor {
    public void createAccount(){
        System.out.println("Part Time Mentor Created!");
    }
}
