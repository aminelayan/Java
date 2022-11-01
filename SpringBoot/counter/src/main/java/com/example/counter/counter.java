package com.example.counter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class counter {
    @RequestMapping("/counter")
    public String viewCount(Model model, HttpSession session) {
        int sessionCounter=(int) session.getAttribute("count");
        sessionCounter++;
        model.addAttribute("counter",sessionCounter);
        return "counter.jsp";
    }
    }

