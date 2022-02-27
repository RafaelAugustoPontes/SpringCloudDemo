package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demos")
public class DemoApiController {

    @GetMapping("/greetings")
    public String greeting() {
        System.out.println("Hey");
        return "Hello world!";
    }

}
