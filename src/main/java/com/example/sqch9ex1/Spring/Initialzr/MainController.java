package com.example.sqch9ex1.Spring.Initialzr;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class MainController {

    private final LoggedUserManagementService loggedUserManagementService;

    public MainController(
            LoggedUserManagementService loggedUserManagementService){
        this.loggedUserManagementService = loggedUserManagementService;
    }

    @GetMapping("/main")
    public String home(
            @RequestParam(required = false) String logout,
            Model model
    ) {
        if (logout != null) {
            loggedUserManagementService.setUsername(null);
        }
        String username = loggedUserManagementService.getUsername();
        if (username == null) {
            return "redirect:/";
        }
        model.addAttribute("username" , username);
        return "templates/main.html";
    }

}
