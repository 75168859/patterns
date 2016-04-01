package com.miiceic.refactor.pattern.proxy.example;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RealSubject target = new RealSubject();
		Proxy proxy = new Proxy(target);
		proxy.login();
	}

}
