package com.miiceic.refactor.pattern.prototype;

public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		User u = new User();
		Address address = new Address();
		u.setAddress(address);
		
		try {
			User u1 = (User)u.deepClone();
			System.out.println(u==u1);
			System.out.println(u1.getAddress()==u.getAddress());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
