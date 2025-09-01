package com.Coding.Jatin.M1.IntroductionToSpringBoot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "coffee.machine", havingValue = "latte", matchIfMissing = true)
public class LatteMachine implements CoffeeMachine {

    @Override
    public String Brew() {
        return "Brewing a smooth Latte ☕";
    }
}
