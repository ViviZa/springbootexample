package com.spingbootexample.spingbootexample;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class PersonClient {

    public PersonModel getPerson(String id){
        ArrayList<PersonModel> models = createPersons();
        for(int i = 0 ; i < models.size(); i++){
            PersonModel personModel = models.get(i);
            if (personModel.id.equals(id)){
                return personModel;
            }
        }
        return null;
    }

    public ArrayList<PersonModel> createPersons(){
        PersonModel person1 = new PersonModel("1","Paul", 20, "Müller");
        PersonModel person2 = new PersonModel("2","Lisa", 20, "Meier");
        PersonModel person3 = new PersonModel("3","Lars", 20, "Müller");
        ArrayList<PersonModel> array = new ArrayList<>();
        array.add(person1);
        array.add(person2);
        array.add(person3);
        return array;
    }
}
