package com.miiceic.refactor.pattern.memento.whiteboxcheckpoints;

import java.lang.ref.SoftReference;

public class Client
{

	private static Originator o = new Originator();
	private static Caretaker c = new Caretaker(o);

	static public void main(String[] args)
	{ 
		o.setState("state 0");
		c.createMemento();
		//Memento   m1  vector  index
		
		o.setState("state 1");
		c.createMemento();
		//Memento  m2   vector
		
		o.setState("state 2");
		c.createMemento();
		//Memento m3   vctor  index
		
		o.setState("state 3");
		c.createMemento();
		
		o.setState("state 4");
		c.createMemento();
		//Memento   m5  vector index
		
	    o.printStates();
        System.out.println("=====================");
		System.out.println("Restoring to 2");
		c.restoreMemento(2);
		o.printStates();
		
//		System.out.println("Restoring to 0");
//		c.restoreMemento(0);
//		o.printStates();
//		
//		System.out.println("Restoring to 3");
//		c.restoreMemento(3);
//		o.printStates();
//		
		Object obj = new Object();
		SoftReference<Object> s = new SoftReference<Object>(obj);
		obj = null;
		s.get();
		
	} 
}
