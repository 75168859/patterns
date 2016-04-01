package com.miiceic.refactor.pattern;

public abstract class Price {
	public abstract double getPrice(int daysRental);
	int getFrequentRenterPoints(int daysRental) {
		
		return  1;
	}
}
