package com.miiceic.refactor.pattern.proxy.example;
//�������ͱ�������� һ����ͬһ�����͵�
public class Proxy implements Subject{
	private RealSubject real;
	public Proxy(RealSubject real){
		this.real = real;
	}
	@Override
	public void login() {
		System.out.println("��½ǰ����־����....");
		real.login();
		System.out.println("��¼�����־����...");
	}
	@Override
	public void update() {
		System.out.println("��½ǰ����־����....");
		real.update();
		System.out.println("��¼�����־����...");
	}

}
