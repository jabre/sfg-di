package com.jabre.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * @author : Jabre
 * @created : 12/2/2021, Thursday
 **/
@Service
public class PropertyInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Property";
    }
}
