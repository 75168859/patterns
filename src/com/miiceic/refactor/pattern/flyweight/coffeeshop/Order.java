package com.miiceic.refactor.pattern.flyweight.coffeeshop;
public abstract class Order
{  
    public abstract void serve(Table table);

    public abstract String getFlavor();

    /** @link dependency */
    /*#Table lnkTable;*/
}