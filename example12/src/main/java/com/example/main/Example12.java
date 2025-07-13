package com.example.main;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example12 {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        Person person = context.getBean(Person.class);

        System.out.println("vehicle name: " + vehicle.getName());
        System.out.println("person name: " + person.getName());

        System.out.println("person vehicle name: " + person.getVehicle().getName());
     }
}
