package com.spingbootexample.spingbootexample;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class PersonClientTest {

    private PersonClient client = new PersonClient();

    @Test
    public void checkIfPersonWithIdIsReturned(){
        PersonModel model = client.getPerson("1");
        assertThat(model.firstName, is("Paul"));
    }

}