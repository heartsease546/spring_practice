package com.myblog.controller;

import com.myblog.entity.Admin;
import com.myblog.service.AdminService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@RequestMapping(value = "/backend")
public class AdminController {

    private static final Logger LOGGER = LogManager.getLogger(AdminController.class);

    @Autowired
    private AdminService adminService;

    /*
    @ModelAttribute
    public void adminModel(String account, String password, Model model) {
        Admin admin = new Admin();
        admin.setAccount(account);
        admin.setPassword(password);
        model.addAttribute(admin);
    }
    */

    @RequestMapping(value = "/", method = POST)
    public String welcome(HttpServletRequest request) {
        if (request.getSession() == null) {
            System.out.println("Session is null");
            return "login";
        }
        if (request.getSession().getAttribute("admin") == null) {
            System.out.println("admin is null");
            return "login";
        } else {
            return "index";
        }
    }

    @RequestMapping(value = "/index", method = GET)
    public String home() {
        LOGGER.info("view name: home");
        return "home"; // view name, will be read by Spring MVC
    }

    @RequestMapping(value = "/login", method = POST)
    // this annotation stands for returning origin text to page
    @ResponseBody
    // public String login(HttpServletRequest request) {
    //     String account = request.getParameter("txt_account");
    //     String password = request.getParameter("txt_password");
    // just could receive the parameter from url
    // public String login(@RequestParam(name = "txt_account") String account, @RequestParam(name = "txt_password") String password) {
    public String login(@RequestBody Map map, HttpServletRequest request) {
        String account = (String) map.get("txt_account");
        String password = (String) map.get("txt_password");
        if (map == null) {
            System.out.println("could not get map");
            return "map is null";
        } else if (map.get("txt_account") == null && map.get("txt_password") == null) {
            System.out.println("admin name & password all null.");
            return "parameter all null";
        } else {
            System.out.println("request account: " + account + ", password: " + password);
            Admin admin = adminService.getAdmin(account, password);
            if (admin != null) {
                LOGGER.info("admin name & password passed.");
                System.out.println("admin name & password passed.");
                request.getSession().setAttribute("admin", admin);
                return "exist";
            } else {
                LOGGER.warn("admin name & password invalid.");
                System.out.println("admin name & password invalid.");
                return "wrong";
            }
        }
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
