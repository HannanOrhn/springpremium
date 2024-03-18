package com.comp.controller;

import com.comp.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController2 {

    @RequestMapping("/employee")
    public String empList(Model model){
        model.addAttribute("name","Ozzy");
        model.addAttribute("name2","Mike");
        model.addAttribute("name3","Jack");

        return "employee-list.html";
    }

    @RequestMapping("/employee-info")
    public String info(Model model){

        Employee employee = new Employee("Hannan","Orhan",85000);
        model.addAttribute("emp",employee);

        return "employee-info.html";
    }
}
