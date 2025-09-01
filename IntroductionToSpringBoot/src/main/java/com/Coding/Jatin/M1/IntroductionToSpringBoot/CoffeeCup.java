package com.Coding.Jatin.M1.IntroductionToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Scope("prototype")
public class CoffeeCup {
    private final CoffeeMachine coffeemachine;
    private final String id;

    @Autowired
    public CoffeeCup(CoffeeMachine coffeemachine) {
        this.coffeemachine = coffeemachine;
        this.id = UUID.randomUUID().toString();
        System.out.println("Your Cup ID is: " + id);
    }


    public void drink() {
        System.out.println("You got your coffee: " + coffeemachine.Brew());
    }

    public String getId() {
        return id;
    }
}
