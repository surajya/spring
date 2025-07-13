package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {


    private String name="Richard";

    //@Autowired
    private final Vehicle vehicle;

//    public Person(Vehicle vehicle) {
//        this.vehicle = vehicle;
//        System.out.println("Person bean created by Spring");
//    }

    @Autowired
    public Person(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

//    public void setVehicle(Vehicle vehicle) {
//        this.vehicle = vehicle;
//    }
}
