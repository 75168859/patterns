package com.miiceic.refactor.pattern.command.audioplayer2;
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