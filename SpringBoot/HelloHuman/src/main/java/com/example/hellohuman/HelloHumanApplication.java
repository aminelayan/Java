package com.example.hellohuman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
@Controller
@RestController
@SpringBootApplication
public class HelloHumanApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloHumanApplication.class, args);
    }

    @RequestMapping("/")
    public String name(@RequestParam (value="name") String name, @RequestParam(value="last_name") String last_name)
    {
        return "Hello " + name+ " "+ last_name;
    }
//...

}
