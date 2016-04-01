package com.miiceic.refactor.pattern.command.audioplayer2;
public class StopCommand implements Command
{
    /**
     * @directed 
     */
    private AudioPlayer myAudio;
	
	public StopCommand ( AudioPlayer a)
    {
		myAudio = a;
	}
	public void execute( )
    {
		myAudio.stop();
	}
}
