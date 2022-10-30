package com.example.firstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// 1. Annotation
@RestController
@SpringBootApplication
public class FirstProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstProjectApplication.class, args);
    }
    // 1. Annotation
    @RequestMapping("/")
    // 3. Method that maps to the request route above
    public String hello() { // 3
        return "Hello Friend!";
    }
    @RequestMapping("/daikichi")
    // 3. Method that maps to the request route above
    public String welcome() { // 3
        return "Welcome";
    }
    @RequestMapping("/daikichi/today")
    // 3. Method that maps to the request route above
    public String today() { // 3
        return "Today you will find luck in all your endeavors";
    }
    @RequestMapping("/daikichi/tomorrow")
    // 3. Method that maps to the request route above
    public String tomorrow() { // 3
    return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
    }
}
