package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanLifeCycleSpringApplication {

	public static void main(String[] args) {
		//load the Spring configuration file
		ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		//retrieve the bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//call the method from 
		System.out.println(theCoach.getDailyWorkout());
		
		//close context
		context.close();
	}
}
