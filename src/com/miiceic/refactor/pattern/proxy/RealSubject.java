package com.miiceic.refactor.pattern.proxy;
public class RealSubject extends Subject 
{
	public RealSubject()
	{ 
	}
	
	public void request()
	{ 
		System.out.println("From real subject.");
		
	}

	@Override
	public void bus2() {
		System.out.println("do bus2....");
	}
}