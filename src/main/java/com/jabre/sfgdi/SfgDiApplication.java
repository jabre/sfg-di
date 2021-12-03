package com.jabre.sfgdi;

import com.jabre.sfgdi.controllers.ConstructorInjectedController;
import com.jabre.sfgdi.controllers.MyController;
import com.jabre.sfgdi.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = (MyController) applicationContext.getBean("myController");
		String greeting = myController.sayHello();
		System.out.println(greeting);

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) applicationContext.getBean("constructorInjectedController");
		greeting = constructorInjectedController.getGreeting();
		System.out.println(greeting);

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) applicationContext.getBean("propertyInjectedController");
		greeting = propertyInjectedController.getGreeting();
		System.out.println(greeting);

	}

}
