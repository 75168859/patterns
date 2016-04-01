package com.miiceic.refactor.pattern.proxy.da;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyHandle implements InvocationHandler{
	private Object target;//目标对象
	public MyHandle(Object target){
		this.target = target;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("业务之前的日志事务处理...");
		method.invoke(target, args);//方法反射的处理
		System.out.println("业务之后的日志事务处理...");
		return null;
	}

}
