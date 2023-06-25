package com.website.main_aplication_steins_now.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    private final String baseUrlOfViews = "loginControllerViews";
    @GetMapping("/login")
    public String login (){
        return String.format("%s/login",this.baseUrlOfViews);

    }
}
