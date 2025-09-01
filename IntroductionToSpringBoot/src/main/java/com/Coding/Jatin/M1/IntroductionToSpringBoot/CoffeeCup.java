package com.Coding.Jatin.M1.IntroductionToSpringBoot;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Scope("prototype")
public class CoffeeCup {
   private final String id;

    public CoffeeCup() {
        this.id = UUID.randomUUID().toString();
        System.out.println("Your Cup ID is: " +id);
    }

    public String getId() {
        return id;
    }
}
