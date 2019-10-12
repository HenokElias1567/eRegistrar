package edu.mum.cs.student.eregistrar.controller;

import edu.mum.cs.student.eregistrar.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = {"","/"})
    public String homePage(){

        return "home-page";
    }

}

