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

    @GetMapping("/entry/{id}")
    public ModelAndView getPerson(@PathVariable String id){
        ModelAndView mav = new ModelAndView("ShowPerson");
        PersonModel personModel = personClient.getPerson(id);
        mav.addObject("person", personModel);
        return mav;
    }

    @GetMapping("/phonebook")
    public ModelAndView getBook(){
        ModelAndView mav = new ModelAndView("ShowBook");
        mav.addObject("personList", personClient.createPersons());
        return mav;
    }
}
