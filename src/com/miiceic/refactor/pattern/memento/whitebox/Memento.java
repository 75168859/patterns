package com.miiceic.refactor.pattern.memento.whitebox;
//备忘录  将发起人对象传入状态保存
public class Memento
{
    private String state;

    public Memento(String state)
    {
        this.state = state;
    }

    public String getState()
    {
        return this.state;
    }

    public void setState(String state)
    {
        this.state = state;
    }
}
