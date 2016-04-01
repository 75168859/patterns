package com.miiceic.refactor.pattern.prototype.manager;

public class Client {
	private PrototypeManager mgr;
	private Prototype prototype;
	public void registPrototype(){
		prototype = new ConcretePrototype();
		Prototype copytype = (Prototype)prototype.clone();
		mgr.add(copytype);
	}
}
