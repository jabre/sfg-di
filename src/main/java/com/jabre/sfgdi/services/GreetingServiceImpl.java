package com.jabre.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * @author : Jabre
 * @created : 12/1/2021, Wednesday
 **/
@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Worldd";
    }
}
