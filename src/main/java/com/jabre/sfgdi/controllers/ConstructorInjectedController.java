package com.jabre.sfgdi.controllers;

import com.jabre.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * @author : Jabre
 * @created : 12/1/2021, Wednesday
 **/
@Controller
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
