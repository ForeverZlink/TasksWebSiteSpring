package com.website.main_aplication_steins_now.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/User")
public class UserController {
    @GetMapping("/Create_New_User")
    public String Create_New_User(Model model){
        model.addAttribute("user",new UserModel());

        return "form_create_user";
    }
}
