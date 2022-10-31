package com.example.fruityloop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;

@Controller
public class index {
    @RequestMapping("/")
    public String Item(Model model) {
        ArrayList<Items> fruits = new ArrayList<>();
        fruits.add(new Items("Kiwi",1.5));
        fruits.add(new Items("Mango",2.0));
        fruits.add(new Items("Goji Berries",4.0));
        fruits.add(new Items("Guava",0.75));
        model.addAttribute("fruits",fruits);
        return "index.jsp";
    }
}


