package com.example.daikichi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

@SpringBootApplication
public class DaikichiPathVariablesApplication {

    public static void main(String[] args) {
        SpringApplication.run(DaikichiPathVariablesApplication.class, args);
    }

    @RequestMapping("/daikchi/travel/{city}")
    public String travel(@PathVariable("city") String city) {
        return "Congratulations! You will soon travel to " + city;
    }

    @RequestMapping("/daikchi/loto/{number}")
    public String loto(@PathVariable("number") int number ) {
        if (number%2==0){
        return "You will take a grand journey in the near future, but be weary of tempting offers";}
        else {
            return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
        }
    }
}
