package com.miiceic.refactor.pattern.prototype.panda;

import java.util.HashSet;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User u = new User("aa",30);
		User u2 = new User("bb",20);
		
	HashSet<User> users = new HashSet<User>();
	users.add(u);
	users.add(u2);
	System.out.println(users.size());
	u.setName("xx");
	users.remove(u);
	System.out.println(users.size());
		

	}

}
