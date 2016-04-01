package com.miiceic.refactor.pattern.command.television;
public class Joe
{
	public static void main(String[] args)
	{
		//请求的发送者只需要拿到遥控器
        test1().turnOff();
        test1().turnOn();
        
	}
   /*
    * 工厂负责对invoker角色的包装
    */
    private static Control test1()
    {
	    Tv  myTv = new Tv();

	    OnCommand on = new OnCommand(myTv);
	    OffCommand off = new OffCommand(myTv);
        ChannelCommand channel = new ChannelCommand(myTv, 2);

	    Control control = new Control( on, off, channel);
        return control;
        /*control.turnOn();
        control.changeChannel();

        control.turnOff();*/
    }

    /**
     * @link aggregation
     * @directed 
     */
    private Control control;
}



