package com.miiceic.refactor.pattern;
import java.util.Enumeration;
import java.util.Vector;
import java.util.concurrent.BlockingQueue;

public class Customer {
	private String name;
	private Vector<Rental> rentals = new Vector<Rental>();

	public Customer(String name) {
		super();
		this.name = name;
	}

	public void addRental(Rental rental) {
		this.rentals.add(rental);
	}

	public String getName() {
		return name;
	}

	public String statement() {
		Enumeration<Rental> rs = rentals.elements();
		String result = "Rental Record for " + getName() + "\n";
		while (rs.hasMoreElements()) {
			Rental rental = rs.nextElement();
			result += "\t" + rental.getMovie().getTitle() + "\t"
					+ String.valueOf(rental.getCharge()) + "\n";
		}
		result += "Amount owed is " + String.valueOf(getTotalAmout()) + "\n";
		result += "You earned " + String.valueOf(getFrequentRenterPoints())
				+ "frequent renter points";
		return result;
	}
	public double getTotalAmout(){
		double result = 0;
		Enumeration<Rental> rs = rentals.elements();
		while (rs.hasMoreElements()) {
			Rental rental = rs.nextElement();
			result += rental.getCharge();
		}
		return result;
	}
	public double getFrequentRenterPoints(){
		double result = 0;
		Enumeration<Rental> rs = rentals.elements();
		while (rs.hasMoreElements()) {
			Rental rental = rs.nextElement();
			result += rental.getFrequentRenterPoints();
		}
		return result;
	}
}
