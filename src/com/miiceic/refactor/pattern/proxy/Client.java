package com.miiceic.refactor.pattern.proxy;
public class Client
{
  	private static Subject subject;

    static public void main(String[] args)
	{ 
		subject = new ProxySubject();
		subject.request();
		//subject.request();
		subject.bus2();
		
	}
}
