package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeSpringApplication {
	public static void main(String[] args) {
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrieve bean from the Spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		boolean result = (theCoach == alphaCoach);
		
		//call method in the bean
		System.out.println("\nPrinting to the same object: "+ result);
		
		System.out.println("\nMemory location of theCoach: "+theCoach);
		
		System.out.println("\nMemory location of theCoach: "+alphaCoach);
	}

}
