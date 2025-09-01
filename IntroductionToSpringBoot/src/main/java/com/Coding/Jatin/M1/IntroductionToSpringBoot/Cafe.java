package com.Coding.Jatin.M1.IntroductionToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cafe {
    
    @Autowired
    private CoffeeService coffeeService;

    @Autowired
    private CoffeeCup Cup1;

    @Autowired
    private CoffeeCup Cup2;

    public void CheckCupId(){
        System.out.println("Cup1 Your Id is: "+Cup1.getId());
        System.out.println("Cup2 Your Id is: "+Cup2.getId());

        if(Cup1==Cup2){
            System.out.println("Both cups are the SAME instance ☕ (singleton)");
        }else{
            System.out.println("Each cup is a NEW instance 🍵 (prototype)");
        }
    }
    
    public void orderCoffee(){
        coffeeService.ServeCoffee();
    }
}
