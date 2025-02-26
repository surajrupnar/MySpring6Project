package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService{

	//creating a string array
			private String[] data = {
				"Beware of the wolf in the sheep's clothing",
				"Diligence is the mother of good luck",
				"The journy is the reward"
			};
			
	//create a Random number generator
	private Random myRandom =  new Random();
	
			
	@Override
	public String getFortune() {
		int index = myRandom.nextInt(data.length);
		String theFortune = data[index];
		return theFortune;
	}

}
