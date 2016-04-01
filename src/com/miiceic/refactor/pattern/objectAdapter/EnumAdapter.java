package com.miiceic.refactor.pattern.objectAdapter;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumAdapter  implements Enumeration{
	private Iterator itor;
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

