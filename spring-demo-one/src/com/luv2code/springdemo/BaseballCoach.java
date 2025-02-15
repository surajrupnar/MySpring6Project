package com.luv2code.springdemo;

public class BaseballCoach implements Coach{
	
	//define private fields and constructor
	private FortuneService fortuneService;
	
	//Constructor injection
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice back vally for 20 min";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

}
