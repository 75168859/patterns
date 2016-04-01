package com.miiceic.refactor.pattern.simplefactory;

import java.io.IOException;
import java.util.Properties;

public class Factory {
	private static Factory factory = null;
	private Properties prop = new Properties();
	private Factory(){
		try {
			prop.load(Factory.class.getResourceAsStream("/../../env.properties"));
		//Factory.class.getClassLoader().getResourceAsStream(name)
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Factory getInstance(){
		if(factory==null)
			factory = new Factory();
		return factory;
	}
	MessageSupplier getMessageSupplier()throws Exception{
		return (MessageSupplier)Class.forName("").newInstance();
	}
	MessagePrint getMessagePrint()throws Exception{
		return (MessagePrint)Class.forName("").newInstance();
	}
}
