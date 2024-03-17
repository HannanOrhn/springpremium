package com.comp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

//if class doesn't have a dependency or itself is a dependency for any other class(es)
//we do not need to annotate with @Component annotation
@Data
@AllArgsConstructor
public class Student {
    private int id;
    private String firstName;
    private String lastName;
}
