package com.comp.service;

import com.comp.repository.EmployeeRepository;
import com.comp.repository.HoursRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SalaryService {
    //we have dependency for these below 2 interfaces
    private final EmployeeRepository employeeRepository;
    private final HoursRepository hoursRepository;
    private final HoursRepository hoursRepository2;

    //we need to create a constructor for dependency injection
    public SalaryService(EmployeeRepository employeeRepository,@Qualifier("regularHours") HoursRepository hoursRepository,@Qualifier("overtimeHours") HoursRepository hoursRepository2) {
        this.employeeRepository = employeeRepository;
        this.hoursRepository = hoursRepository;
        this.hoursRepository2 = hoursRepository2;
    }

    public void calculateRegularSalary(){
        //hourlyRate * RegularHours
        System.out.println(employeeRepository.getHourlyRate() * ( hoursRepository.getHours() + hoursRepository2.getHours()) );
    }
}
