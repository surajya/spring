package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Example5 {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle veh1 = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh1.getName());

    }
}
