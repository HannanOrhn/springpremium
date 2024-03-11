package com.comp.stereotype_annotation.practice.model;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
@Component
@AllArgsConstructor
public class DataStructure {
    private final ExtraHours extraHours;
    /*there are 3 ways for DI(dependency injection/has-a relation)
    1-Constructor + @Autowired annotation
    2-Put @AllArgsConstructor coming from lombok / @Data + @NonNull
    3-Put Getter & Setter
     */

//    @Autowired
//    public DataStructure(ExtraHours extraHours) {
//        this.extraHours = extraHours;
//    }

    public void getTotalHours(){
        System.out.println("Total Hours : " + (30 + extraHours.getHours()));}
}
