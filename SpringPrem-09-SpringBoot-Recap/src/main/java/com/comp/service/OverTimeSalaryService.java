package com.comp.service;

import com.comp.repository.EmployeeRepository;
import com.comp.repository.HoursRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OverTimeSalaryService {
    private final EmployeeRepository employeeRepository;
    private final HoursRepository hoursRepository;

    public OverTimeSalaryService(EmployeeRepository employeeRepository,@Qualifier("overtimeHours") HoursRepository hoursRepository) {
        this.employeeRepository = employeeRepository;
        this.hoursRepository = hoursRepository;
    }

    public void calculateOvertimeSalary(){
        System.out.println(employeeRepository.getHourlyRate() * hoursRepository.getHours());
    }

}
