package com.miiceic.refactor.pattern.proxy.staticProxy;

public class RealSubject implements Subject{

	@Override
	public void request() {
		//Ȩ�޵Ŀ��ơ���־�Ĵ�������Ĵ���
		System.out.println("real...request...");
		//��־�Ĵ�������Ĵ���
	}

	@Override
	public void update() {
		//Ȩ�޵Ŀ��ơ���־�Ĵ�������Ĵ���
		System.out.println("udpate...");
		//��־�Ĵ�������Ĵ���
	}

}
