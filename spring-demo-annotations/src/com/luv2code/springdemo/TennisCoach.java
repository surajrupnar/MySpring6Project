package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*@Component("theSillyCoach")*/
@Component
@Scope("prototype")
public class TennisCoach implements Coach {
	
	//define the field injection method-4
	/*
	 * @Autowired private FortuneService fortuneService;
	 */

	//define the @Qualifier Annotation-5
	/*
	 * @Autowired
	 * 
	 * @Qualifier("happyFortuneService") private FortuneService fortuneService;
	 */
	
	//define the @Qualifier Annotation for RandonFortuneSercvice-6
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	//Autowired injection for construction injectiomn -1
	/*
	 * @Autowired 
	 * public TennisCoach(FortuneService thefortuneService) {
	 * fortuneService = thefortuneService; }
	 */
	
	//define a default constructor
	public TennisCoach() {
		System.out.println("TennisCoach: Inside default constructor");
	}
	
	//define the setter method-2
	/*
	 * @Autowired public void setFortuneService(FortuneService fortuneService) {
	 * System.out.println("TennisCoach: Inside setFortuneService() method");
	 * this.fortuneService = fortuneService; }
	 */
	
	//define the (Autowired on method)method injection-3
	/*
	 * @Autowired public void doSomeCrazyStuff(FortuneService fortuneService) {
	 * System.out.println("TennisCoach: Inside doSomeCrazyStuff() method");
	 * this.fortuneService = fortuneService; }
	 */



	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volly";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
