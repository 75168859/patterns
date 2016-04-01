package com.miiceic.refactor.pattern.proxy.dynaProxy;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Subject subject = new RealSubject();
		Subject subjectProxy = (Subject) Proxy.newProxyInstance(subject
				.getClass().getClassLoader(), subject.getClass()
				.getInterfaces(), new BuilderProxy(subject));
	    subjectProxy.request();
	    subjectProxy.update();
	    
	    
	    int[] a = {1,2,3};
	    int[] b = {4,5,6};
	    System.out.println(a.getClass()==b.getClass());
	    System.out.println(a.getClass()==int[].class);
	    Object o1 = a;
	    String[][] ss={
	    		{"hello","world"},
	    		{"aaaa","bbb"}
	    };
	    Object o2 = ss;
	    Object[] o3 = ss;
	    Object[][] o4 = ss;
	    
	    
	    ArrayList<String> list1 = new ArrayList<String>();
	    ArrayList aa = new ArrayList();
	    System.out.println(list1.getClass()==aa.getClass());
	    list1.add("aa");
	    //list1.add(10);
	    try {
			Method method = list1.getClass().getMethod("add", Object.class);
			method.invoke(list1, 10);
		} catch (Exception e) {
			e.printStackTrace();
		}
	    System.out.println(list1.size());
	}
	//jdk 动态代理
	//第三方生成代理的工具 clib   javasisent代理
   public static void f(int[] a){
	   
   }
}

