package com.example.omikuform;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class form {
    @RequestMapping("/")
    public String index() {
        return "form.jsp";
    }

    @PostMapping("/show")
    public String show(@RequestParam(value = "numbers") String numbers,
                       @RequestParam(value = "name") String name,
                       @RequestParam(value = "city") String city,
                       @RequestParam(value = "hobby") String hobby,
                       @RequestParam(value = "thing") String thing,
                       @RequestParam(value = "text") String text, HttpSession session) {
        session.setAttribute("numbers", numbers);
        session.setAttribute("name", name);
        session.setAttribute("city", city);
        session.setAttribute("hobby", hobby);
        session.setAttribute("thing", thing);
        session.setAttribute("text", text);
        return "redirect:/show";
    }

    @RequestMapping("/show")
    public String showFortune(Model model, HttpSession session) {
        model.addAttribute("numbers", session.getAttribute("numbers"));
        model.addAttribute("city", session.getAttribute("city"));
        model.addAttribute("name", session.getAttribute("name"));
        model.addAttribute("hobby", session.getAttribute("hobby"));
        model.addAttribute("thing", session.getAttribute("thing"));
        model.addAttribute("text", session.getAttribute("text"));

        return "show.jsp";
    }
}

