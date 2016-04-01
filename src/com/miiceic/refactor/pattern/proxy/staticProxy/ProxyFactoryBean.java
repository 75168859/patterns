package com.miiceic.refactor.pattern.proxy.staticProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactoryBean implements InvocationHandler{
	private Object target;//Ŀ�����--�����ķ������ᱻinvoke����������
	public ProxyFactoryBean(Object target){
		this.target = target;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		//System.out.println("Ȩ�޿��ơ���־������...");
		//System.out.println("������");
		TransactionManager.begin();
		try {
			method.invoke(target, args);
		} catch (Exception e) {
			System.out.println("����ع�");
		}
		System.out.println("�����ύ");
		return null;
	}
	public Object getProxy(){
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}
}
