package com.jabre.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author : Jabre
 * @created : 12/3/2021, Friday
 **/
@Primary
@Service
public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Word - Primary bean";
    }
}
