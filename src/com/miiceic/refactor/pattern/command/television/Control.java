package com.miiceic.refactor.pattern.command.television;
public class Control
{    
    /**
     * @directed 
     */
	/*通过配置文件进行添加*/
    private Command onCommand, offCommand, changeChannel;

	public Control(Command on, Command off, Command channel)
    {
		onCommand = on;
		offCommand = off;
        changeChannel = channel;
	}

	public void turnOn()
    {
		onCommand.execute() ;
	}

	public void turnOff()
    {
		offCommand.execute();
	}

    public void changeChannel()
    {
    	changeChannel.execute();
    }
}

