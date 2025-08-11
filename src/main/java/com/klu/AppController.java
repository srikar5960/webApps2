package com.klu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class AppController {
    
    @GetMapping("/demo1")
    public String fun1() {
        return "Sum of two numbers is 25";
    }
}

