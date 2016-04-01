package com.miiceic.refactor.pattern.prototype;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Person p = new Person();
		Address address = new Address();
		p.setAddress(address);
		Person p1 = (Person) p.deepClone();
		System.out.println(p==p1);
		System.out.println(p.getAddress()==p1.getAddress());

	}

}
