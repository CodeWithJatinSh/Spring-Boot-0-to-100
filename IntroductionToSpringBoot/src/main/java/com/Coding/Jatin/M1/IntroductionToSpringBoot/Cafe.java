package com.Coding.Jatin.M1.IntroductionToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cafe {
    
    @Autowired
    private CoffeeService coffeeService;
    
    public void orderCoffee(){
        coffeeService.ServeCoffee();
    }
}
