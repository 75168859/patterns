package com.miiceic.refactor.pattern.memento.whitebox;
//������  �����������´����ı���¼�����Լ����ڲ�״̬��������
public class Originator
{
    private String state;

    /** @link dependency 
     * @label wide*/
    /*#Memento lnkMemento;*/
       //�������� ����һ���µı���¼����
    public Memento createMemento()
    {
        return new Memento(state);
    }
    //�������˻ָ�������¼���������ص�״̬
    public void restoreMemento(Memento memento)
    {
        this.state = memento.getState();
    }
    //��ȡֵ�ķ���
    public String getState()
    {
        return this.state;
    }
    //״̬�ĸ�ֵ����
    public void setState(String state)
    {
        this.state = state;
        System.out.println("Current state = " + this.state);
    }
}
