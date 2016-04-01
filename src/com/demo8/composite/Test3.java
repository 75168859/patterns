package com.demo8.composite;

public class Test3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1  = "hello";
		String s2 = "hello"+"world";
		String s3 = "helloworld";
		System.out.println(s3==s2);
		String s4 = s1+"world";
		System.out.println(s4==s3);
	}
	

}
