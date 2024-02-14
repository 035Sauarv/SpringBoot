package com.saurav.springBootSecurity.demoSecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/showMyLoginPage")
    public String showMyLoginPage(){
        return "fancy-login";
    }

    // add request mapping for
    @GetMapping("/access-denied")
    public String showAccessDenied(){
        return "access-denied";
    }

}
