package com.school.schedule.app;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParentTest {

    int id = 111;
    String firstName = "Josh";
    String lastName = "Bravo";
    String phoneNumber = "1234567890";
    Boolean isVolunteer = true;
    Parent parent;

    @BeforeEach
    void setUp(){
        parent = new Parent(id, firstName,lastName,phoneNumber,isVolunteer);
    }

    @Test
    void testGetAndSetPhoneNumber(){
        parent.setPhoneNumber("123456");
        assertEquals(parent.getPhoneNumber(), "123456");
    }

    @Test
    void testGetAndSetIsVolunteer(){
        parent.setIsVolunteer(false);
        assertEquals(parent.getIsVolunteer(), false);
    }

    @Test
    void testToString(){
        assertTrue(parent.toString().contains(String.valueOf(id)));
        assertTrue(parent.toString().contains(firstName));
        assertTrue(parent.toString().contains(lastName));
        assertTrue(parent.toString().contains(phoneNumber));
        assertTrue(parent.toString().contains(String.valueOf(isVolunteer)));




    }
}
