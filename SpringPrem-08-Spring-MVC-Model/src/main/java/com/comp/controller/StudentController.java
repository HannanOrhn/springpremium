package com.comp.controller;

import com.comp.model.Gender;
import com.comp.model.Mentor;
import com.comp.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class StudentController {
    @RequestMapping("/welcome")
    public String homePage(Model model){
        //model methods
        model.addAttribute("name","Hannan");
        model.addAttribute("course","MVC");

        String subject = "Collections";
        model.addAttribute("subject",subject);

        //create some random student id and show it in ui
        int  student_id = new Random().nextInt();
        model.addAttribute("student_id",student_id);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(14);
        numbers.add(24);
        numbers.add(34);
        model.addAttribute("numbers",numbers);

        Student student = new Student(1,"Beko","Orhan");
        model.addAttribute("student",student);

        /*
        Mentor mentor = new Mentor("Hannan","Orhan",28, Gender.FEMALE);

        model.addAttribute("mentor",mentor);

        Mentor mentor1 = new Mentor("Belkis","Orhan",34,Gender.FEMALE);

        model.addAttribute("mentor1",mentor1);

        Mentor mentor2 = new Mentor("Bilal","Orhan",40,Gender.MALE);

        model.addAttribute("mentor2",mentor2);
         */

        return "student/welcome";
    }
}
