package com.comp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
//    @RequestMapping("/user")
//    public String user(){
//        return "/userinfo.html";//go to the static folder and check there, however our html is not under static we need to map
//    }
@RequestMapping("/user")
public String user(){
    return "/user/userinfo.html";
}
}
