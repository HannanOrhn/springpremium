package com.comp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/car")
public class CarController {
    @RequestMapping("/info") //localhost:8080/car/info?make=Honda&year=2005
    public String carInfo(@RequestParam String make, @RequestParam int year, Model model){
        model.addAttribute("make",make);
        model.addAttribute("year",year);
        return "car/car-info";
    }

    @RequestMapping("/info2")
    public String carInfo2(@RequestParam(value = "make",required = false,defaultValue = "Tesla") String make, Model model){
        model.addAttribute("make",make);
        return "car/car-info";
    }
    @RequestMapping("/info3/{make}/{year}") //localhost:8080/car/info3/honda
    public String carInfo3(@PathVariable String make,@PathVariable int year, Model model){
        model.addAttribute("make",make);
        model.addAttribute("year",year);
        return "car/car-info";
    }
}
