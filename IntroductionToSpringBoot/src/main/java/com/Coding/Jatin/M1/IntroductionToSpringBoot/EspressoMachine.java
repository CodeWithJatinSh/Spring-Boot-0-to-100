package com.Coding.Jatin.M1.IntroductionToSpringBoot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "coffee.machine", havingValue = "espresso", matchIfMissing=false)
public class EspressoMachine implements CoffeeMachine {

    @Override
    public String Brew() {
        return "Brewing a strong Espresso ☕";
    }
}
