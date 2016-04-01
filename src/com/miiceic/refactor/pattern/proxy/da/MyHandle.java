package com.miiceic.refactor.pattern.proxy.da;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyHandle implements InvocationHandler{
	private Object target;//Ŀ�����
	public MyHandle(Object target){
		this.target = target;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("ҵ��֮ǰ����־������...");
		method.invoke(target, args);//��������Ĵ���
		System.out.println("ҵ��֮�����־������...");
		return null;
	}

}
