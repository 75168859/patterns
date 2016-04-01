package com.miiceic.refactor.pattern.abstractfactory.farm;
public interface Gardener
{
    public Fruit createFruit(String name);

    public Veggie createVeggie(String name);
}
