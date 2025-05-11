package com.java;

public class StudentScore {
	Calculator calci;
	private int score;
	
	public StudentScore(Calculator calci) {
		this.calci= calci; 
	}
	
	public void calculateScore(int maths, int science) {
		if(maths < 0 || maths > 100 || science < 0 || science > 100)
			this.score = -1;
		else 
			this.score = calci.mult(maths, science);
	}
	
	public int getScore() {
		return this.score;
	}
}
