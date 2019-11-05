package com.Q15;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	
	public static void main(String []args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach coach1 = context.getBean("CricketCoach",CricketCoach.class);
		
		System.out.println(coach1.getDailyWorkout());
		System.out.println(coach1.getDailyFortune());

		
		Coach coach2 = context.getBean("BaseballCoach",BaseballCoach.class);
		
		System.out.println(coach2.getDailyWorkout());
		System.out.println(coach1.getDailyFortune());

		
		//context.close();
	
	}

}
