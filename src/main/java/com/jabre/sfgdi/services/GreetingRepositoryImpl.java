package com.jabre.sfgdi.services;

import org.springframework.stereotype.Component;

/**
 * Author : Jabre
 * Created : 12/6/2021, Monday
 **/
@Component
public class GreetingRepositoryImpl implements GreetingRepository {

    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary Greeting service";
    }

    @Override
    public String getSpanishGreeting() {
        return "Servicio de Saludo Primario";
    }

    @Override
    public String getGermanGreeting() {

        return "Primärer Grußdienst";

    }
}