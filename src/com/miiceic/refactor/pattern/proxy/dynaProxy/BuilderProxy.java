package com.miiceic.refactor.pattern.proxy.dynaProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//����������
public class BuilderProxy implements InvocationHandler{
	private Object target;//Ŀ����󣬱��������
	public BuilderProxy(Object target){
		this.target = target;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
	     System.out.println("��ǰ����־������");
	     method.invoke(target, args);
	     System.out.println("�ۺ���־������");
	     
		return null;
	}

}
