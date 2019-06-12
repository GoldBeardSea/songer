package com.Goldbeard.songer;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SongerControllerTest {
    public SongerController tester;

    @Before
    public void initialized() {
        tester = new SongerController();
    }

    @Test
    public void test_capitalize() {

        assertEquals("Should capitalize", "SPECIALIZED", tester.capitalize("spEcIalIzEd"));
        assertEquals("Should capitalize", "TOO1MUCH0WOW", tester.capitalize("too1MUCH0wow"));

    }

    @Test
    public void test_reverse() {
        assertEquals("Should reverse the strings", "Cat the Taco", tester.reverse("Taco the Cat"));
        assertEquals("Should reverse the strings", "I am a software developer", tester.reverse("developer software a am I"));
    }

}