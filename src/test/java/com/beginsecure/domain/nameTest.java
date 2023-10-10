package com.beginsecure.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class nameTest {

    private name Name;


    @BeforeEach
    void setUp() {
        Name = new name();
    }

    @Test
    void getFullName() {
        Name.setFirstName("John");
        Name.setLastName("Doe");
        assertEquals("JOHN DOE", Name.getFullName());


    }

    @Test
    void getFirstName() {

        Name.setFirstName("Kasper");
        assertEquals("Kasper", Name.getFirstName());


    }

    @Test
    void getLastName() {
        Name.setLastName("Maukkonen");
        assertEquals("Maukkonen", Name.getLastName());


    }

}