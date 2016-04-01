package com.miiceic.refactor.pattern.objectAdapter;

import java.util.Enumeration;
import java.util.Iterator;

public class Adatperxxx implements Iterator{
	Enumeration e;

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return e.hasMoreElements();
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return e.nextElement();
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}
	

}
