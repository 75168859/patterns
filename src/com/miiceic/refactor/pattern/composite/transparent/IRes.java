package com.miiceic.refactor.pattern.composite.transparent;
/*
 * 抽象构件，物品
 * */
public interface IRes {
    /**购物买单,示意性的商业方法*/
    public void pay();
 
    /**加入新的物品*/
    public void addRes(IRes res);
 
    /**放回物品*/
    public void removeRes(IRes res);
}
