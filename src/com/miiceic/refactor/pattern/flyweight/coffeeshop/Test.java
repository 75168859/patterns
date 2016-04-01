package com.miiceic.refactor.pattern.flyweight.coffeeshop;

import java.util.HashMap;
import java.util.Random;

public class Test {
	public static void main(String[] args) {
		final A a1 = new A();
		final B b1 = new B();
		for(int i = 0; i < 2;i++){
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					int data = new Random().nextInt(10000);
					//hm.put(Thread.currentThread(), data);
					hm.set(data);
					System.out.println(Thread.currentThread()+" put the data is:"+data);
					a1.f();
					b1.f();
				}
			}).start();
		}
	}
	//private static HashMap<Thread, Integer> hm = new HashMap<Thread, Integer>();
	private static ThreadLocal<Integer> hm = new ThreadLocal<Integer>();
	static class A{
		void f(){
			System.out.println(Thread.currentThread()+" from A the data is:"+hm.get());
		}
	}
	static class B{
		void f(){
			System.out.println(Thread.currentThread()+" from B the data is:"+hm.get());
		}
	}

}
class XX{
	//创建同一个线程同一个对象
	private XX(){}
	static ThreadLocal<XX> x = new ThreadLocal<XX>();
	public static XX getInstance(){
		XX xx = x.get();
		if(xx==null){
			xx = new XX();
			x.set(xx);
		}
		return xx;
	}
}
