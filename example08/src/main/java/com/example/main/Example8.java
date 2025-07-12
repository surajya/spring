package com.example.main;

import com.example.beans.Vehicle;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Example8 {
    public static void main(String[] args) {

        var context = new ClassPathXmlApplicationContext("bean.xml");

       Vehicle vehicle = context.getBean("vehicle", Vehicle.class);

       System.out.println("Vehicle name is : "+vehicle.getName());

    }
}
