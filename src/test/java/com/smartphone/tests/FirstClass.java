package com.smartphone.tests;

import com.github.javafaker.CreditCardType;
import com.github.javafaker.Faker;

public class FirstClass {

    public static void main(String[] args) {


        System.out.println("Hello World");
        Faker faker = new Faker();
        System.out.println(faker.animal().name());
        System.out.println(faker.finance().creditCard(CreditCardType.AMERICAN_EXPRESS));






    }

}
