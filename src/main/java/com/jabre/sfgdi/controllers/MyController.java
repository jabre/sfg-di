package com.jabre.sfgdi.controllers;

import org.springframework.stereotype.Controller;

/**
 * @author : Jabre
 * @created : 12/1/2021, Wednesday
 **/
@Controller
public class MyController {

    public String sayHello() {
        System.out.println("Hello Word");

        return "Hi folks";
    }
}
