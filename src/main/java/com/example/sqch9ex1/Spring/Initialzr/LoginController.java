package com.example.sqch9ex1.Spring.Initialzr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private String username;

    private boolean loggedIn;
    @GetMapping("/")
    public String loginGet(){
        return "login.html";
    }

    @PostMapping("/")
    public String loginPost(
            @RequestParam String username,
            @RequestParam String password,
            Model model
    ){

        if(username.equals("natalie") && password.equals("password")){
            loggedIn = true;
            model.addAttribute("username", username);
            this.username = username;
        return "redirect:/main";
        } else {
            loggedIn = false;
            model.addAttribute("message", "Login failed!");
        }

        return "login.html";
    }

    @GetMapping("/main")
    public String mainPage(Model model) {
        model.addAttribute("username", username );
        return "main.html";
    }
}
