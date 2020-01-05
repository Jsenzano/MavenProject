package Jsenzano;

import com.github.javafaker.Faker;

public class TestData {
    /*
    1. Create a method which will return List of random First Names
    2. Create a method which will return list of random Last Names
    3. Create a method which will return a list of random Phone Numbers
    4. Create a method which will return a list fo random Addresses



     */
    Faker faker = new Faker();

    public  String firstName(){
        return faker.name().firstName();
    }

    public  String lastName(){
        return faker.name().lastName();
    }
    public String phoeNumber(){
        return faker.phoneNumber().phoneNumber();
    }

    public  String address(){
        return faker.address().fullAddress();
    }


}
