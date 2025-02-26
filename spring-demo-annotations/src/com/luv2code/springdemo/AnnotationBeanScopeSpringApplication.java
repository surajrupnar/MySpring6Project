package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeSpringApplication {
	public static void main(String[] args) {
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve the bean from the spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		//check if they are the same
		boolean result = (theCoach == alphaCoach);
		
		//print the result
		System.out.println("\n Point to the same object: " +result);
		
		System.out.println("\nMemory location for theCoach: " +theCoach);
		
		System.out.println("\nMemory location for alphaCoach: " +alphaCoach+ "\n");
		
		//close the context
		context.close();
	}
}
