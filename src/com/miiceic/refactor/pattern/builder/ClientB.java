package com.miiceic.refactor.pattern.builder;
public class ClientB {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("ClientB 完成与Director生产汽车A的合同");
		Director director = new Director();
		director.getProductB();
	}

}