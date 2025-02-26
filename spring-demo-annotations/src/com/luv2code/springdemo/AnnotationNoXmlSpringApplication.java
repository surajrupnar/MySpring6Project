package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationNoXmlSpringApplication {
	public static void main(String[] args) {
		//read the spring configuration 
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportsConfig.class);
		
		//retrieve the bean from the spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		//call the method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//call the method on the bean
		System.out.println(theCoach.getDailyFortune());
				
		//close context
		context.close();
	}

}
