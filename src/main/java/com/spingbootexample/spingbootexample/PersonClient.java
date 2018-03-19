package com.spingbootexample.spingbootexample;

import org.springframework.stereotype.Component;

@Component
public class PersonClient {

    public PersonModel getPerson(){
        PersonModel model = new PersonModel("Paul", 20, "Müller");
        return model;
    }
}
