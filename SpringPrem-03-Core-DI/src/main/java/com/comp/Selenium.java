package com.comp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Selenium {

    OfficeHours officeHours;
    @Autowired
    public Selenium(OfficeHours officeHours){
        this.officeHours=officeHours;
    }
    public void getTeachingHours(){
        System.out.println("Weekly teaching hours : " + (15 + officeHours.getHours()));
    }
}
