package com.miiceic.refactor.pattern.memento.whitebox;
//发起人  发起人利用新创建的备忘录对象将自己的内部状态保存起来
public class Originator
{
    private String state;

    /** @link dependency 
     * @label wide*/
    /*#Memento lnkMemento;*/
       //工厂方法 返回一个新的备忘录对象
    public Memento createMemento()
    {
        return new Memento(state);
    }
    //将发起人恢复到备忘录对象所记载的状态
    public void restoreMemento(Memento memento)
    {
        this.state = memento.getState();
    }
    //获取值的方法
    public String getState()
    {
        return this.state;
    }
    //状态的赋值方法
    public void setState(String state)
    {
        this.state = state;
        System.out.println("Current state = " + this.state);
    }
}
