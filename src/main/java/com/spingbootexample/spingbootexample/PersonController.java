package com.spingbootexample.spingbootexample;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PersonController {

    @Autowired
    private PersonClient personClient;

    @GetMapping("/{id}")
    public ModelAndView getPerson(@PathVariable String id){
        ModelAndView mav = new ModelAndView("ThePerson");
        PersonModel model = personClient.getPerson(id); //Optional
        mav.addObject("model", model);
        return mav;
    }
}
