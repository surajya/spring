package com.example.config;



import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@ComponentScan("com.example.beans")
@Component
public class ProjectConfig {

}
