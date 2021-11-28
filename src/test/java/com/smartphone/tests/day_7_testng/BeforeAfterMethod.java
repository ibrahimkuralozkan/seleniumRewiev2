package com.smartphone.tests.day_7_testng;

import org.testng.annotations.*;

public class BeforeAfterMethod {



    @BeforeClass
    public void beforeclass(){

        System.out.println("before class");

    }

    @AfterClass
    public void afterclass(){

        System.out.println("after class");
    }

    @BeforeMethod
    public void setup(){

        System.out.println("Before Method");

    }
    @AfterMethod
    public void tearDown(){
        System.out.println("After Method");


    }
     @Test
    public void test1(){

         System.out.println("Run 1");

     }

    @Test
    public void test2(){

        System.out.println("Run 2");

    }
}
