package com.miiceic.refactor.pattern;

public class NewPrice extends Price{

	@Override
	public double getPrice(int daysRental) {
		// TODO Auto-generated method stub
		return daysRental * 3;
	}
	@Override
	int getFrequentRenterPoints(int daysRental) {
		return daysRental > 1 ? 2 : 1;
	}

}
