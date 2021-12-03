package com.jabre.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author : Jabre
 * @created : 12/3/2021, Friday
 **/
@Profile("ES")
@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Spanish";
    }
}
