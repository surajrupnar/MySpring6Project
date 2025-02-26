package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		//read the Spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from the spring container
		// Coach theCoach = context.getBean("theSillyCoach", Coach.class); 
		
		//If name for @Component is not given the it takes the default with first latter as small
		Coach theCoach =  context.getBean("tennisCoach", Coach.class);
		
		//call the method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//call the method on the bean
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();

	}

}
