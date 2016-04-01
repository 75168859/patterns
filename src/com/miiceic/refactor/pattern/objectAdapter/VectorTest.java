package com.miiceic.refactor.pattern.objectAdapter;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v = new Vector<String>();
		/*Iterator<String> itor = v.iterator();
		while(itor.hasNext()){
			System.out.println(itor.next());
		}*/
	  Enumeration<String> x = 	v.elements();
	  while(x.hasMoreElements()){
		  System.out.println(x.nextElement());
	  }
	}

}
class MyAdapter implements Enumeration{
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
