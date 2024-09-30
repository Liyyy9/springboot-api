package com.liyana.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    // URL: http://localhost:8080/greeting?name=Martin
    //      http://localhost:8080/greeting?name=Liyana&attendance=false
    @GetMapping("/greeting")
    public String greeting(
     @RequestParam(name = "name", required = false,
     defaultValue = "World") String name,
     @RequestParam(name="attendance", required = false,
     defaultValue = "true") String attendance, Model model) {

        model.addAttribute("name", name);
        model.addAttribute("attendance", attendance);
        return "greeting";
    }

}
