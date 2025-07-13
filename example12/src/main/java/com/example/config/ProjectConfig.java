package com.example.config;



import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@ComponentScan("com.example.beans")
@Component
public class ProjectConfig {

    @Bean
    public Vehicle vehicle1() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Suzuki");
        return vehicle;
    }

    @Bean
    @Primary
    public Vehicle vehicle2() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Toyota");
        return vehicle;
    }

    @Bean
    public Vehicle vehicle3() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda");
        return vehicle;
    }
}
