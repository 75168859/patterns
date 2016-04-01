package com.miiceic.refactor.pattern.simplefactory;

import java.text.DateFormat;

public class Test {
	public static void main(String[] args)throws Exception {
		//使用者和创建者分离
		Fruit fruit = FruitGardener.factory("grape");
		//Fruit fruit = FruitGardener.getIntance();
		fruit.grow();
		fruit.harvest();
		
		
		//DateFormat.getDateInstance();
		//Runtime.getRuntime();
		
		
		
		
		
	}

}

