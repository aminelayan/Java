package com.example.counter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class welcome {
    @RequestMapping("/")
    public String index(HttpSession session) {

        // If the count is not already in session
        if (session.getAttribute("count") == null) {
            // Use setAttribute to initialize the count in session
            session.setAttribute("count", 0);
        } else {
            // increment the count by 1 using getAttribute and setAttribute
            int counter = (int) session.getAttribute("count");
            counter++;
            session.setAttribute("count", counter);
        }
        return "welcome.jsp";
    }
}
