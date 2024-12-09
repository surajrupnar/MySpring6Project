
  package com.luv2code.springdemo;
  
  public class MyApp { public static void main(String[] args) { 
	  //Coach thecoach = new CricketCoach(); 
	  Coach thecoach = new BaseballCoach(null);
  System.out.println(thecoach.getDailyWorkout()); } }
 