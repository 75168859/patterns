package com.miiceic.refactor.pattern.flyweight.coffeestall;
//抽象享元角色
public abstract class Order
{  
	//将咖啡卖给客人
    public abstract void serve();
    //返还咖啡名字
    public abstract String getFlavor();

}