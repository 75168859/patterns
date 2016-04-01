package com.miiceic.refactor.pattern.proxy.example;
//代理对象和被代理对象 一定是同一个类型的
public class Proxy implements Subject{
	private RealSubject real;
	public Proxy(RealSubject real){
		this.real = real;
	}
	@Override
	public void login() {
		System.out.println("登陆前的日志处理....");
		real.login();
		System.out.println("登录后的日志处理...");
	}
	@Override
	public void update() {
		System.out.println("登陆前的日志处理....");
		real.update();
		System.out.println("登录后的日志处理...");
	}

}
