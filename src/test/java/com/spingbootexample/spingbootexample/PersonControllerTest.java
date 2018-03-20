package com.spingbootexample.spingbootexample;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import static org.junit.Assert.*;

public class PersonControllerTest{
    private PersonController controller = new PersonController();

    @Test
    public void correctPersonIsReturned(){
        ModelAndView mav = controller.getPerson("2");
        //assertThat(mav.getModel());
    }

}