package com.Q15;

public class BaseballCoach  implements Coach{
	
	private FortuneService fortune;

	public BaseballCoach(FortuneService fortune) {
		super();
		this.fortune = fortune;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortune.getDailyFortune();
	}

}
