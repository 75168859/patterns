package com.miiceic.refactor.pattern.builder;
public class ClientB {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("ClientB �����Director��������A�ĺ�ͬ");
		Director director = new Director();
		director.getProductB();
	}

}