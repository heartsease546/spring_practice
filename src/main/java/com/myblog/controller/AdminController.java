package com.myblog.controller;

import com.myblog.entity.Admin;
import com.myblog.service.AdminService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@RequestMapping(value = "/backend")
public class AdminController {

    private static final Logger LOGGER = LogManager.getLogger(AdminController.class);

    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "/index", method = GET)
    public String home() {
        LOGGER.info("view name: home");
        return "home"; // view name, will be read by Spring MVC
    }

    @RequestMapping(value = "/login", method = POST)
    @ResponseBody
    public String login(HttpServletRequest request) {
        String account = request.getParameter("txt_account");
        String password = request.getParameter("txt_password");
        Admin admin = adminService.getAdmin(account, password);
        if (admin == null) {
            LOGGER.warn("admin name & password invalid.");
            System.out.println("admin name & password invalid.");
            return "null";
        }
        return "exist";
    }

    @RequestMapping(value = "/login", method = GET)
    public String login() {
        return "login";
    }

    // account checking ajax does not need to return page
    // so the return type is void
    @RequestMapping(value = "/checkAccount", method = GET)
    public void checkAccount(HttpServletRequest request, HttpServletResponse response) {
        String account = request.getParameter("account");

    }
}
