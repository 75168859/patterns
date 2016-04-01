package com.miiceic.refactor.pattern.factorymethod;

import java.util.Properties;



public class Test {
	private static Properties prop = new Properties();
	static{
		try {
			prop.load(Test.class.getResourceAsStream("/com/miiceic/refactor/pattern/factorymethod/factory.properties"));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FruitGardener factory = new GrapeGardener();
		//FruitGardener factory = new StrawberryGardener();
		//Fruit fruit = factory.factory();
		//fruit.plant();
		//fruit.grow();
		//fruit.harvest();
		//FruitGardener factory = new AppleGardener();
		FruitGardener factory = null;
		try {
			factory = (FruitGardener)Class.forName(prop.getProperty("factory")).newInstance();
		} catch (Exception e) {
			// TODO: handle exception
		}
		Fruit fruit = factory.factory();
		//Fruit fruit2 = new Apple();
		fruit.grow();
		fruit.harvest();
		fruit.plant();

	

	}

}
