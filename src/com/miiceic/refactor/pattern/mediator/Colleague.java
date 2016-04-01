package com.miiceic.refactor.pattern.mediator;
//抽象同事角色
public abstract class Colleague
{
    private Mediator mediator;	

	public Mediator getMediator() 
	{ 
		return mediator; 
	}
   //接收调停者对象
	public Colleague(Mediator m) 
	{ 
		mediator = m;
	}

    public abstract void action();

    public void change()
    {
        mediator.colleagueChanged(this);
    }
}
