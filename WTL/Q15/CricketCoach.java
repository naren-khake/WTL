package com.Q15;

public class CricketCoach implements Coach{
	
	private FortuneService fortune;

	public CricketCoach(FortuneService fortune) {
		super();
		this.fortune = fortune;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Pratice 15 Minutes";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortune.getDailyFortune();
	}

}
