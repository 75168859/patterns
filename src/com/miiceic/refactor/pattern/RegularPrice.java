package com.miiceic.refactor.pattern;

public class RegularPrice extends Price{

	@Override
	public double getPrice(int daysRental) {
		double result  = 2;
		if (daysRental > 2)
			result += (daysRental - 2) * 1.5;
		return result;
	}

}
