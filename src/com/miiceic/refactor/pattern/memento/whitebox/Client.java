package com.miiceic.refactor.pattern.memento.whitebox;
public class Client
{
    private static Originator o = new Originator();
    private static Caretaker c = new Caretaker();

    public static void main(String[] args)
    {
    	//改变发起人对象的状态
        o.setState("On");

	    // Store internal state创建备忘录对象 并将发起人对象状态存储起来
	    c.saveMemento( o.createMemento() );
	    System.out.println(o.getState());
	    // Continue changing originator
	   o.setState("Off");

	    // Restore saved state
	   o.restoreMemento( c.retrieveMemento() );
	    System.out.println(o.getState());
	    //破坏了对发起人状态的封装

    }
}
