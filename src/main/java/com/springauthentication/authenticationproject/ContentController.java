package com.springauthentication.authenticationproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//First class created follewed by SecurityConfiguration
@Controller //tell spring boot that this is a controller class
public class ContentController {
    @GetMapping("/home")
    public String handleWelcome(){
        return "home";
    }

    @GetMapping("/admin/home")
    public String handleAdminHome(){
        return "home_admin";
    }

    @GetMapping("/user/home")
    public String handleUserHome(){
        return "home_user";
    }
}
