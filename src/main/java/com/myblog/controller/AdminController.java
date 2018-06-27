package com.myblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {

    @RequestMapping(value = "/index", method = GET)
    public String home() {
        return "home"; // view name, will be read by Spring MVC
    }

    public String login() {
        return "login";
    }
}
