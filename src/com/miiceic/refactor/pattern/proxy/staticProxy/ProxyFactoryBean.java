package com.miiceic.refactor.pattern.proxy.staticProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactoryBean implements InvocationHandler{
	private Object target;//目标对象--》它的方法都会被invoke方法所拦截
	public ProxyFactoryBean(Object target){
		this.target = target;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		//System.out.println("权限控制、日志、事务...");
		//System.out.println("事务开启");
		TransactionManager.begin();
		try {
			method.invoke(target, args);
		} catch (Exception e) {
			System.out.println("事务回滚");
		}
		System.out.println("事务提交");
		return null;
	}
	public Object getProxy(){
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}
}
