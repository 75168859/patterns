package com.miiceic.refactor.pattern.command.television;
public class OnCommand implements Command
{
	private Tv myTv;

	public OnCommand (Tv tv)
    {
		myTv = tv;
	}
	public void execute( )
    {
		myTv.turnOn();
	}
}
