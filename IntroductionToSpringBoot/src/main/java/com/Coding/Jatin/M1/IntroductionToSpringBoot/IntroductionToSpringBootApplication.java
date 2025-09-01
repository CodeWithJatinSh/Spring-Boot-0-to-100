package com.Coding.Jatin.M1.IntroductionToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroductionToSpringBootApplication implements CommandLineRunner{
    @Autowired
    private Cafe cafe;

    @Autowired
    private CoffeeCup coffeeMachine;

	public static void main(String[] args) {
        SpringApplication.run(IntroductionToSpringBootApplication.class, args);
	}
    @Override
    public void run(String... args){
        coffeeMachine.drink();
        cafe.orderCoffee();
        cafe.CheckCupId();
    }

}
