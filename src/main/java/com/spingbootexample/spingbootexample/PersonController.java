package com.spingbootexample.spingbootexample;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PersonController {

    @Autowired
    private PersonClient personClient;

    @GetMapping("/")
    public ModelAndView getPerson(){
        ModelAndView mav = new ModelAndView("ThePerson");
        mav.addObject(personClient.getPerson().firstName, "name");
        return mav;
    }
}
