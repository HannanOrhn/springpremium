package com.comp;

import com.comp.config.EmployeeConfig;
import com.comp.service.OverTimeSalaryService;
import com.comp.service.SalaryService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Myapp {

    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(EmployeeConfig.class);

        SalaryService salaryService = container.getBean(SalaryService.class);
        salaryService.calculateRegularSalary();

        OverTimeSalaryService overTimeSalaryService = container.getBean(OverTimeSalaryService.class);
        overTimeSalaryService.calculateOvertimeSalary();
    }

}
