package com.example.displaydate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.time.LocalDateTime;

@Controller
@SpringBootApplication
public class DisplaydateApplication {

    public static void main(String[] args) {
        SpringApplication.run(DisplaydateApplication.class, args);
    }


            @RequestMapping("/")
            public String index() {
                return "index.jsp";
            }
            @RequestMapping("/date")
            public String date(){
            return "date.jsp";
            }
            @RequestMapping("/time")
            public String time(Model date){

                return "time.jsp";

             }
        }

