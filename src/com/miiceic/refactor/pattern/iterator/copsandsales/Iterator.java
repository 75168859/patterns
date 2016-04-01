package com.miiceic.refactor.pattern.iterator.copsandsales;
public interface Iterator
{
	void first();
	void next();
	boolean isDone();
	Object currentItem();
	
} 