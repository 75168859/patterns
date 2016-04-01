package com.miiceic.refactor.pattern;
public class Rental {
	private Movie movie;
	private int daysRental;
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public int getDaysRental() {
		return daysRental;
	}
	public void setDaysRental(int daysRental) {
		this.daysRental = daysRental;
	}
	double getCharge() {
		return movie.getPrice().getPrice(daysRental);
	}
	int getFrequentRenterPoints() {
		return movie.getPrice().getFrequentRenterPoints(daysRental);
	}
	public Rental(Movie movie, int daysRental) {
		super();
		this.movie = movie;
		this.daysRental = daysRental;
	}
	
}
