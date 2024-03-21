package com.comp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
    private String fullName;
    private String department;
    private int hourlyRate;
}
