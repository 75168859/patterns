package com.miiceic.refactor.pattern.proxy.example;

public class RealSubject implements Subject{

	@Override
	public void login() {
		System.out.println("login....");
	}

	@Override
	public void update() {
		System.out.println("update...");
	}

}
