package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Example3 {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle veh1 = context.getBean("Audi-Veh",Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh1.getName());

        Vehicle veh2 = context.getBean("Honda-Veh",Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh2.getName());

        Vehicle veh3 = context.getBean("Ferrari-Veh",Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh3.getName());

    }
}
