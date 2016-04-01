package com.miiceic.refactor.pattern.proxy.dynaProxy;

public class RealSubject implements Subject{

	@Override
	public void request() {
		System.out.println("real...request...");
	}

	@Override
	public void update() {
		System.out.println("udpate...");
	}

}
