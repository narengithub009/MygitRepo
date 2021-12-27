package com.java.mywork;

public class AmusementPark {
	
	private int maleCount;
	private int femaleCount;
	private String day;
	public AmusementPark(int maleCount, int femaleCount, String day) {
		super();
		this.maleCount = maleCount;
		this.femaleCount = femaleCount;
		this.day = day;
	}
	public int getMaleCount() {
		return maleCount;
	}
	public void setMaleCount(int maleCount) {
		this.maleCount = maleCount;
	}
	public int getFemaleCount() {
		return femaleCount;
	}
	public void setFemaleCount(int femaleCount) {
		this.femaleCount = femaleCount;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	@Override
	public String toString() {
		return "AmusementPark [maleCount=" + maleCount + ", femaleCount=" + femaleCount + ", day=" + day + "]";
	}
	
	
	
		
	
}
