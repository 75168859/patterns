package com.miiceic.refactor.pattern.factorymethod;

public class Grape implements Fruit{

	@Override
	public void grow() {
		// TODO Auto-generated method stub
		System.out.println("grape  grow...");
	}

	@Override
	public void harvest() {
		// TODO Auto-generated method stub
		System.out.println("grape...harvet...");
	}

	@Override
	public void plant() {
		// TODO Auto-generated method stub
		System.out.println("grape...plant...");
	}

}
