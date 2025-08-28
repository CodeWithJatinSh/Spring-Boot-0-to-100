package com.Coding.Jatin.M1.IntroductionToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoffeeService {
    @Autowired
    private Coffee coffee;

    public void ServeCoffee(){
        System.out.println("Here is your order: "+coffee.TakeOrder()+" .Have a Nice Day! :)");
    }
}
