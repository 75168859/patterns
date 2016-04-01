package com.miiceic.refactor.pattern.observer;

public class Test1 {
	public static void main(String[] args) {
		ConcreteSubject s1 = new ConcreteSubject("zhangsan");
		
		ConcreteObserver c1 = new ConcreteObserver();
		ConcreteObserver c2 = new ConcreteObserver();
		
		ConcreteObserver2 c3 = new ConcreteObserver2();
		s1.attach(c1);
		s1.attach(c2);
		s1.attach(c3);
		
		s1.setName("lisi");
		System.out.println("=============");
		s1.setName("hello");
	}

}
