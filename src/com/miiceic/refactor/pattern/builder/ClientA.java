package com.miiceic.refactor.pattern.builder;

public class ClientA {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("ClientA �����Director��������A�ĺ�ͬ");
		Director director = new Director();
		director.getProductA();
	}
}