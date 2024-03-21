package com.comp.repository;

import com.comp.model.Employee;
import org.springframework.stereotype.Component;

@Component
public class DBEmployeeRepository implements EmployeeRepository{
    //assume that we're getting data from the database
    @Override
    public int getHourlyRate() {
        Employee employee = new Employee("Harold Finch","IT",65);
        return employee.getHourlyRate();
    }
}
