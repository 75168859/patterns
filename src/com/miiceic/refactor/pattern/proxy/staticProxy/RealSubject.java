package com.miiceic.refactor.pattern.proxy.staticProxy;

public class RealSubject implements Subject{

	@Override
	public void request() {
		//权限的控制、日志的处理、事务的处理
		System.out.println("real...request...");
		//日志的处理、事务的处理
	}

	@Override
	public void update() {
		//权限的控制、日志的处理、事务的处理
		System.out.println("udpate...");
		//日志的处理、事务的处理
	}

}
