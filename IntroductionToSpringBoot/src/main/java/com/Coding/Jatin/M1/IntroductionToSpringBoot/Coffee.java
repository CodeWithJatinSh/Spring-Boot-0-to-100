package com.Coding.Jatin.M1.IntroductionToSpringBoot;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Coffee {
    Scanner sc = new Scanner(System.in);
    public String TakeOrder() {
        // Taking String input
        System.out.println("What would you like to have:) ");
        return sc.nextLine();
    }
}
