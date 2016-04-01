package com.miiceic.refactor.pattern.flyweight.coffeestall;
//��ζ  ������Ԫ��ɫ
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

