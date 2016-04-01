package com.miiceic.refactor.pattern.memento.whitebox;
//������  ���汸��¼���� ���Ӳ��޸��������鿴��
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
