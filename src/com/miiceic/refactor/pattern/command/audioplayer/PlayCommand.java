package com.miiceic.refactor.pattern.command.audioplayer;
public class PlayCommand implements Command
{
	private AudioPlayer myAudio;

	public PlayCommand ( AudioPlayer a)
    {
		myAudio = a;
	}

	public void execute( )
    {
		myAudio.play();
	}
}
