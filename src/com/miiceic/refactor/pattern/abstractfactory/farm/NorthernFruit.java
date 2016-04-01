package com.miiceic.refactor.pattern.abstractfactory.farm;
public class NorthernFruit implements Fruit
{
    private String name;

    public NorthernFruit(String name)
    {
    }

    public String getName()
    {
		return name;
	}

    public void setName(String name)
    {
		this.name = name;
	}

}
