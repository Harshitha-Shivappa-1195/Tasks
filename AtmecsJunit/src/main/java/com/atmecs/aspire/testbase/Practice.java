package com.atmecs.aspire.testbase;

import org.junit.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Practice {
    @Before
    public void beforeMethod() {
        System.out.println("In before method");
    }
    @BeforeClass
    public static void beforeClassMethod() {
        System.out.println("In before class method");
    }

 /*   @ParameterizedTest
    @ValueSource(strings = {"ABC","DEF","GHI"})
    void testWithArrayOfStrings(String arg) {
       System.out.println("Values: "+arg);
    } */
    @Test
    public void testMethod() {
        System.out.println("In test method");
    }
    @After
    public void afterMethod() {
        System.out.println("In after method");
    }
    @AfterClass
    public static void afterClassMethod() {
        System.out.println("In after class method");
    }
}