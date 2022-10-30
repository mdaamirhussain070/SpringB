package com.eazybytes.eazyschool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value={"", "/", "home"})
    public String displayHomePage(Model model) {
        model.addAttribute("username", "John Doe");
        model.addAttribute("schoolName","A H MODEL");
        model.addAttribute("schoolName1","Eazy School");

        return "home.html";
    }

}
