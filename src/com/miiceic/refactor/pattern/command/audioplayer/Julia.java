package com.miiceic.refactor.pattern.command.audioplayer;

import java.util.HashMap;

public class Julia
{
    /**
     * @link aggregation 
     */
    private static Keypad keypad ;

    /**
     * @link aggregation 
     */
    private static AudioPlayer myAudio = new AudioPlayer();

	public static void main(String[] args)
	{
    	//test1().get(args[0]).execute();//�����ع��ĽǶ�ȥ����
		test2().stop();//����ĽǶ�
	}
  //�����ع������߼��ж�
    private static HashMap<String, Command> test1()
    {
    	Command play = new PlayCommand(myAudio);
        Command stop = new StopCommand(myAudio);
        Command rewind = new RewindCommand(myAudio);
       HashMap<String, Command> hm = new HashMap<String, Command>();
       hm.put("play", play);
       hm.put("stop", stop);
       hm.put("rewind", rewind);
       return hm;
      
        
       
    }
    private static Keypad test2()
    {
    	Command play = new PlayCommand(myAudio);
        Command stop = new StopCommand(myAudio);
        Command rewind = new RewindCommand(myAudio);

       keypad = new Keypad(play, stop, rewind);

     return keypad;
      
        
    }
}               

