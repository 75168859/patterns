package com.miiceic.refactor.pattern;

public class ChildrenPrice extends Price{

	@Override
	public double getPrice(int daysRental) {
		double result = 1.5;
		if (daysRental > 3)
			result += (daysRental - 3) * 1.5;
		return result;
	}

}
