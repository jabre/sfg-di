package com.jabre.sfgdi.controllers;

import com.jabre.sfgdi.services.GreetingService;

/**
 * @author : Jabre
 * @created : 12/1/2021, Wednesday
 **/
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
