package com.jabre.sfgdi.controllers;

import com.jabre.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author : Jabre
 * @created : 12/3/2021, Friday
 **/
@Controller
public class I18nController {

    private final GreetingService greetingService;

    public I18nController(@Qualifier("i18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getHello() {
        return greetingService.sayGreeting();
    }

}
