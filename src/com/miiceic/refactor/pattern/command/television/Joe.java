package com.miiceic.refactor.pattern.command.television;
public class Joe
{
	public static void main(String[] args)
	{
		//����ķ�����ֻ��Ҫ�õ�ң����
        test1().turnOff();
        test1().turnOn();
        
	}
   /*
    * ���������invoker��ɫ�İ�װ
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



