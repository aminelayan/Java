package com.example.goldninja;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;

@Controller
public class Control {
    @RequestMapping("/")
    public String index(HttpSession session) {
        if (session.getAttribute("goldSum") == null) {
            ArrayList<String> activitiesList = new ArrayList<String>();
            session.setAttribute("goldSum", 0);
            session.setAttribute("activities", activitiesList);
        } else {
            return "index.jsp";
        }
        return "index.jsp";
    }

    @RequestMapping(value = "/processMoney", method = RequestMethod.POST)
    public String calculateMoney(HttpSession session, @RequestParam(value = "whichForm") String activity) {
        Random rNumber = new Random();
        ArrayList<String> activities = (ArrayList<String>) session.getAttribute  ("activities");
        if ("farm".equals(activity)) {
            int goldFromSession = (int) session.getAttribute("goldSum");
            int randomNum = rNumber.nextInt(10) + 10;
            int goldEarned = goldFromSession + randomNum;
            session.setAttribute("goldSum", goldEarned);
            String thisActivity = "Earned " + randomNum + " gold from the farm!"+ LocalDateTime.now();
            activities.add(0, thisActivity);
        }

         else if ("cave".equals(activity)) {
                int goldFromSession = (int) session.getAttribute("goldSum");
                int randomNum = rNumber.nextInt(10) + 10;
                int goldEarned = goldFromSession + randomNum;
                session.setAttribute("goldSum", goldEarned);
                String thisActivity = "Earned " + randomNum + " gold from the cave! \n";
                activities.add(0, thisActivity);
        }
        else if ("house".equals(activity)) {
            int goldFromSession = (int) session.getAttribute("goldSum");
            int randomNum = rNumber.nextInt(10) + 10;
            int goldEarned = goldFromSession + randomNum;
            session.setAttribute("goldSum", goldEarned);
            String thisActivity = "Earned " + randomNum + " gold from the house! \n";
            activities.add(0, thisActivity);
        }
        else if ("quest".equals(activity)) {
            int goldFromSession = (int) session.getAttribute("goldSum");
            int randomNum = rNumber.nextInt(100) - 50;
            int goldEarned = goldFromSession + randomNum;
            session.setAttribute("goldSum", goldEarned);
            String thisActivity = "Earned or Lost " + randomNum + " gold from the quest! \n";
            activities.add(0, thisActivity);
        }

        return "redirect:/";
    }
}


