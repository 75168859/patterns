package com.miiceic.refactor.pattern.proxy.staticProxy;
//��̬����   ����������Ŀ��ʵ��ͬһ���ӿ�
public class SubjectProxy implements Subject{
	//��Ŀ�������Ϊ�Լ��ĳ�Ա
	private Subject realSubject;
	public SubjectProxy(Subject subject){
		this.realSubject = subject;
	}
	@Override
	public void request() {
		System.out.println("��ǰ.��־������");
		realSubject.request();
		System.out.println("�ۺ���־������");
	}
	@Override
	public void update() {
		System.out.println("��ǰ.��־������");
		realSubject.update();
		System.out.println("�ۺ���־������");
	}
	

}
