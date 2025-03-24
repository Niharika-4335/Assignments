package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class Addconfig {

    @RequestMapping("/add")
    @ResponseBody  // This makes sure the method directly returns text instead of a view
    public String add() {
        System.out.println("Adding numbers - printed in console");
        return "Hello from Spring MVC! Check the console for output.";
    }
}