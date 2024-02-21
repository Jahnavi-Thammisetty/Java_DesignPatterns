package com.ty;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person.Builder("John")
                .age(30)
                .email("john@example.com")
                .phone("1234567890")
                .build();


        Person person2 = new Person.Builder("Jane").build();
        System.out.println("Name: " + person1.getFirstName() );
        System.out.println("Age: " + person1.getAge());
        System.out.println("Email: " + person1.getEmail());
        System.out.println("Phone: " + person1.getPhone());
        System.out.println("*********************************");
        System.out.println("Name: " + person2.getFirstName());
        System.out.println("Age: " + person2.getAge());
        System.out.println("Email: " + person2.getEmail());
        System.out.println("Phone: " + person2.getPhone());





    }
}