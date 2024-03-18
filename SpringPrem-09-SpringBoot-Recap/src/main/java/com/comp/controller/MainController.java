package com.comp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping("/welcome")
    public String welcome(){
        return "welcome.html";//we put directly html name since this file directly under the static folder
    }
    @RequestMapping("/employees")
    public String emp(){
        return "employees.html";
    }
    @RequestMapping("/")
    public String home(){
        return "home.html";
    }
}
