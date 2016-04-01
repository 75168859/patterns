package com.miiceic.refactor.pattern.flyweight.coffeestall;
//风味  具体享元角色
public class Flavor extends Order
{  
	private String flavor;
	
	public Flavor(String flavor)
	{
	    this.flavor = flavor;
	}
	
	public String getFlavor()
	{
	    return this.flavor;
	}
	
	public void serve()
	{
	    System.out.println("Serving flavor " + flavor );
	}
}

