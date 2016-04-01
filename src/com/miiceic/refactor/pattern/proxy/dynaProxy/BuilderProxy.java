package com.miiceic.refactor.pattern.proxy.dynaProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//代理生成器
public class BuilderProxy implements InvocationHandler{
	private Object target;//目标对象，被代理对象
	public BuilderProxy(Object target){
		this.target = target;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
	     System.out.println("售前、日志、事务");
	     method.invoke(target, args);
	     System.out.println("售后、日志、事务");
	     
		return null;
	}

}
