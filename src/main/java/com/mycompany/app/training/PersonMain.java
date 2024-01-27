package com.mycompany.app.training;

// PersonMain.java
// PersonMain Class
public class PersonMain {
    public static void main(String[] args) {
        // Create an instance of Person
        Person person = new Person();

        // Set values using setter methods
        person.setName("Srini");
        person.setAge(25);
        person.setCountry("USA");

        // Get values using getter methods
        String name = person.getName();
        int age = person.getAge();
        String country = person.getCountry();

        // Print the values
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Country: " + country);
    }
}