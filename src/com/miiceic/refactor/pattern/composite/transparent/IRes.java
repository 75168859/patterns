package com.miiceic.refactor.pattern.composite.transparent;
/*
 * ���󹹼�����Ʒ
 * */
public interface IRes {
    /**������,ʾ���Ե���ҵ����*/
    public void pay();
 
    /**�����µ���Ʒ*/
    public void addRes(IRes res);
 
    /**�Ż���Ʒ*/
    public void removeRes(IRes res);
}
