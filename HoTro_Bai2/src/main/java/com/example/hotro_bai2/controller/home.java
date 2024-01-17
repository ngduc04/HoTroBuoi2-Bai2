package com.example.hotro_bai2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/home")
public class home {
    @GetMapping()
    public String homeController(){
        return "/home";
    }
    @GetMapping("/caculator")
    public String result(@RequestParam ("number1") double number1,
                        @RequestParam ("number2") double number2,
                        @RequestParam ("option") String option,
                        Model model){
        double result = 0;
        switch (option) {
            case"+":
                result = number1 + number2;
                break;
            case"-":
                result = number1 - number2;
                break;
            case"x":
                result = number1 * number2;
                break;
            case":":
                result = number1 / number2;
                break;
        }
        model.addAttribute("caculator", result);


    return "/home";
}
}
