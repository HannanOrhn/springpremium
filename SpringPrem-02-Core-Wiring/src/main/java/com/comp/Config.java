package com.comp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    Car car(){
        Car car = new Car();
        car.setMake("Tesla");
        return car;
    }

   /*
   //direct wiring
    @Bean
    Person person(){
        Person person = new Person();
        person.setName("Bill");
        person.setCar(car());
        return person;
    }
    */

    //auto wiring
    @Bean
    Person person(Car car){
        Person person = new Person();
        person.setName("Bill");
        person.setCar(car);
        return person;
    }
}
