package com.jabre.sfgdi.controllers;

import com.jabre.sfgdi.services.GreetingService;

/**
 * @author : Jabre
 * @created : 12/1/2021, Wednesday
 **/
public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
