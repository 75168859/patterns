package com.miiceic.refactor.pattern.factorymethod;
                                                         
public class AppleGardener implements FruitGardener 
{
    public Fruit factory()
    {
        return new Apple();
    }
}
