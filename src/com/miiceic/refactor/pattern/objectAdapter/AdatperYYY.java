package com.miiceic.refactor.pattern.objectAdapter;

import java.util.Enumeration;
import java.util.Iterator;

public class AdatperYYY implements Enumeration {
   Iterator itor;
	@Override
	public boolean hasMoreElements() {
		// TODO Auto-generated method stub
		return itor.hasNext();
	}

	@Override
	public Object nextElement() {
		// TODO Auto-generated method stub
		return itor.next();
	}
	
}

