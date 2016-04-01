package com.miiceic.refactor.pattern.proxy.da;

import java.lang.reflect.Proxy;
//java.lang.String
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		UserServiceImpl target = new UserServiceImpl();
		UserService proxy = (UserService)Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new MyHandle(target));
		//proxy.login();
		proxy.update();
		proxy.delete();
		
		//cglib   javasisent 第三方的代理技术
		System.out.println(Test.class.getClassLoader().getClass().getName());
		System.out.println(System.class.getClassLoader());
	    //写自己的类加载器
	}

}
