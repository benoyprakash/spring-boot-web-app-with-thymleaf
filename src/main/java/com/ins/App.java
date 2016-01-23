package com.ins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
 
/**
 * @author Benoy Prakash
 *
 */
@EnableAutoConfiguration
@Configuration
@ComponentScan(basePackages = {"com.ins", "com.ins.controller"})
public class App {
    /**
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(App.class);
    }
}