package com.miiceic.refactor.pattern.mediator;
//����ͬ�½�ɫ
public abstract class Colleague
{
    private Mediator mediator;	

	public Mediator getMediator() 
	{ 
		return mediator; 
	}
   //���յ�ͣ�߶���
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
