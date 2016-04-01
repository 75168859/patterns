package com.miiceic.refactor.pattern;
public class Movie {
	public static final int CHILDRENS = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	private String title;
	private int priceCode;
	private Price price;
	public Movie(String title, int priceCode) {
		super();
		this.title = title;
		//this.priceCode = priceCode;
		setPriceCode(priceCode);
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPriceCode() {
		return priceCode;
	}
	
	public Price getPrice() {
		return price;
	}
	public void setPrice(Price price) {
		this.price = price;
	}
	public void setPriceCode(int priceCode) {
		//this.priceCode = priceCode;
		switch (priceCode) {
		case REGULAR:
			price = new RegularPrice();
			break;
		case CHILDRENS:
			price = new ChildrenPrice();
			break;
		case NEW_RELEASE:
			price = new NewPrice();
		}
	}
	/*public double getCharge(int daysRental){
		double result = 0;
		switch (getPriceCode()) {
		case Movie.REGULAR:
			result += 2;
			if (daysRental > 2)
				result += (daysRental - 2) * 1.5;
			break;
		case Movie.NEW_RELEASE:
			result += daysRental * 3;
			break;
		case Movie.CHILDRENS:
			result += 1.5;
			if (daysRental > 3)
				result += (daysRental - 3) * 1.5;
			break;
		}
		return result;
	}*/
	/*int getFrequentRenterPoints(int daysRental) {
		if ((getPriceCode() == Movie.NEW_RELEASE)
				&& daysRental > 1)
	    return 2;
		return  1;
	}*/
	
}
