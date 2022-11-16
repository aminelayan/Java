package com.example.quiresandjoins.Controller;

import com.example.quiresandjoins.Service.countryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    countryService countryService;

    @RequestMapping("/api/countries")
    public List<Object[]> index() {
        return countryService.getsolvene();
    }

    @RequestMapping("/api/cities")
    public List<Object[]> cities() {
        return countryService.getcitiesdereaseing();
    }

    @RequestMapping("/api/greater500")
    public List<Object[]> greater500() {
        return countryService.greater500();
    }

    @RequestMapping("/api/greater89perc")
    public List<Object[]> greater89perc() {
        return countryService.greater89perc();
    }

    @RequestMapping("/api/greater100")
    public List<Object[]> greater100() {
        return countryService.greater100();
    }

    @RequestMapping("/api/morethan200")
    public List<Object[]> morethan200() {
        return countryService.morethan200();
    }

    @RequestMapping("/api/morethan500")
    public List<Object[]> morethan500() {
        return countryService.morethan500();
    }

    @RequestMapping("/api/region")
    public List<Object[]> region() {
        return countryService.region();
    }


}


