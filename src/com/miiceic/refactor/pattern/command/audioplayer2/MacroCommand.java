package com.miiceic.refactor.pattern.command.audioplayer2;
public interface MacroCommand extends Command
{
	void execute();
	
	void remove(Command toRemove);
	
	void add(Command toAdd);
}
