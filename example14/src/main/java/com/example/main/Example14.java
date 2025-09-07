package com.example.main;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example14 {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle1 = context.getBean("vehicle1", Vehicle.class);
        Vehicle vehicle2 = context.getBean("vehicle2", Vehicle.class);

        System.out.println("vehicle name: " + vehicle1.hashCode());
        System.out.println("person name: " + vehicle2.hashCode());

       // System.out.println("person vehicle name: " + person.getVehicle().getName());
     }
}
