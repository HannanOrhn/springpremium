package com.comp.controller;

import com.comp.model.Gender;
import com.comp.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/another")
public class AnotherController {
    @RequestMapping("/list")//localhost:8080/another/list
    public String showTable(Model model){
        List<Mentor> mentorList = new ArrayList<>();

        mentorList.add(new Mentor("Hannan","Orhan",28, Gender.FEMALE));
        mentorList.add(new Mentor("Belkis","Orhan",34,Gender.FEMALE));
        mentorList.add(new Mentor("Bilal","Orhan",40,Gender.MALE));

        model.addAttribute("mentors",mentorList);
        return "mentor/mentor-list";
    }
}
