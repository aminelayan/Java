package com.dojos_and_ninjas.Controllers;

import com.dojos_and_ninjas.Models.Dojo;
import com.dojos_and_ninjas.Models.Ninja;
import com.dojos_and_ninjas.Services.DojoService;
import com.dojos_and_ninjas.Services.NinjaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class DojosNinjasController {
    private final NinjaService ninjaService;
    private final DojoService dojoService;

    public DojosNinjasController(NinjaService ninjaService, DojoService dojoService) {
        this.ninjaService = ninjaService;
        this.dojoService = dojoService;
    }

    @GetMapping("/ninjas")
    public String allNinjas(Model model, @ModelAttribute("ninjas") Ninja ninja) {
        List<Ninja> ninjas = ninjaService.allNinjas();
        model.addAttribute("ninjas", ninjas);
        return "ninjas.jsp";
    }

    @GetMapping("/dojos")
    public String allDojos(Model model, @ModelAttribute("dojos") Dojo dojo) {
        List<Dojo> dojos = dojoService.allDojos();
        model.addAttribute("dojos", dojos);
        return "dojos.jsp";

    }
    @GetMapping("/ninja/new")
    public String createPage(@ModelAttribute("ninjas") Ninja ninja,Model model) {
            List<Dojo> allDojos=dojoService.allDojos();
            model.addAttribute("dojosList",allDojos );
            return "newninja.jsp";
    }

    @PostMapping("/ninja/new")
    public String createNinja(@Valid @ModelAttribute("ninjas") Ninja ninja, BindingResult result) {
        if (result.hasErrors()) {
            return "newninja.jsp";
        } else {
            ninjaService.createNinja(ninja);
            return "redirect:/ninjas";

        }

    }
    @GetMapping("/ninja/{id}")
    public String showNinja(@PathVariable("id") Long id, Model model) {
        Ninja ninja=ninjaService.findNinja(id);
        model.addAttribute("thisNinja", ninja);
        return "showninja.jsp";
    }



    @GetMapping("/dojo/{id}")
    public String showDojo(@PathVariable("id") Long id, Model model) {
        Dojo dojo=dojoService.findDojo(id);
        model.addAttribute("thisDojo", dojo);
        return "showdojo.jsp";
    }

    @GetMapping("/dojo/new")
    public String createPage(@ModelAttribute("dojos") Dojo dojo) {
        return "newdojo.jsp";
    }
    @PostMapping("/dojo/new")
    public String createDojo(@Valid @ModelAttribute("dojos") Dojo dojo, BindingResult result) {
        if (result.hasErrors()) {
            return "newdojo.jsp";
        } else {
            dojoService.createDojo(dojo);
            return "redirect:/dojos";

        }
    }
}
