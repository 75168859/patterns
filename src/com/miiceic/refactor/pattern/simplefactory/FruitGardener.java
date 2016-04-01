package com.miiceic.refactor.pattern.simplefactory;

import java.text.DateFormat;
import java.util.Properties;

public class FruitGardener {
	private static Properties prop = new Properties();
	static{
		try {
			prop.load(FruitGardener.class.getResourceAsStream("/com/miiceic/refactor/pattern/simplefactory/env.properties"));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static Fruit getIntance(){
		try {
			return(Fruit)Class.forName(prop.getProperty("fruit")).newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} 
	}
	public static Fruit factory(String which) throws BadFruitException {
		if (which.equalsIgnoreCase("apple")) {
			return new Apple();
		} else if (which.equalsIgnoreCase("strawberry")) {
			return new Strawberry();
		} else if (which.equalsIgnoreCase("grape")) {
			return new Grape();
		} else {
			throw new BadFruitException("Bad fruit request");
		}

	}
}
