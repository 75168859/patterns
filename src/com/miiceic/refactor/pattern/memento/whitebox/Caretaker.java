package com.miiceic.refactor.pattern.memento.whitebox;
//负责人  保存备忘录对象 （从不修改甚至不查看）
public class Caretaker
{
    /**
     * @link aggregation 
     * @label wide
     */
    private Memento memento;

    public Memento retrieveMemento()
    {
        return this.memento;
    }

    public void saveMemento(Memento memento)
    {
     	this.memento = memento;
    }
}
