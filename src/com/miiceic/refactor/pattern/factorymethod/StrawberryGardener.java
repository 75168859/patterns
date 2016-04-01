package com.miiceic.refactor.pattern.factorymethod;                                                     



public class StrawberryGardener implements FruitGardener 
{
    public Fruit factory()
    {
        return  new Strawberry();
    }
}
