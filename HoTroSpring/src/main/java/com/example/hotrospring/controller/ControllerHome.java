package com.example.hotrospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/home")
public class ControllerHome {
    @GetMapping()
    public String showForm(){
        return "/home";
    }

    @GetMapping("/caculator")
    public String caculator(@RequestParam("number1") int number1,
                          @RequestParam("number2") int number2,
                          Model model){
        System.out.println(number1);
        System.out.println(number2);

        int result = number1 + number2;
        model.addAttribute("result", result);
        return "/home";
    }
}
