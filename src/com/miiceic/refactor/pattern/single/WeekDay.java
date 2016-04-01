package com.miiceic.refactor.pattern.single;

public abstract class WeekDay {
	public static final WeekDay MON = new WeekDay(){
		public WeekDay nextDay() {return null;};
		
	};
	public static final WeekDay TUE = new WeekDay(){
		public WeekDay nextDay() {return null;};
	};
	public static final WeekDay WED = new WeekDay(){
		public WeekDay nextDay() {return null;};
	};
	private WeekDay(){}
	public abstract WeekDay nextDay();
}
