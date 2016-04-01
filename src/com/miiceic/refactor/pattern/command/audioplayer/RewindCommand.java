package com.miiceic.refactor.pattern.command.audioplayer;
public class RewindCommand implements Command
{
	private AudioPlayer myAudio;

	public RewindCommand ( AudioPlayer a)
    {
	    myAudio = a;
	}
	public void execute()
    {
	    myAudio.rewind();
	}
}