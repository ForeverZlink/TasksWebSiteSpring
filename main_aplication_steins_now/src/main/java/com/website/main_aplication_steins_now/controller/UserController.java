package com.website.main_aplication_steins_now.controller;


import com.website.main_aplication_steins_now.models.UserModel;
import com.website.main_aplication_steins_now.repository.UserRepository;
import com.website.main_aplication_steins_now.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    public UserService userService;
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/createNewUser")
    public String createNewUser(Model model){
        model.addAttribute("user",new UserModel());

        return "form_create_user";
    }

    @PostMapping("/createNewUserPost")
    public String createNewUserPost(@ModelAttribute UserModel user){
        this.userService.addEntity(user);

        return "index";
    }
}
