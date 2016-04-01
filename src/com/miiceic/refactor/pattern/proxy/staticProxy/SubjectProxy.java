package com.miiceic.refactor.pattern.proxy.staticProxy;
//静态代理   代理类必须和目标实现同一个接口
public class SubjectProxy implements Subject{
	//把目标对象作为自己的成员
	private Subject realSubject;
	public SubjectProxy(Subject subject){
		this.realSubject = subject;
	}
	@Override
	public void request() {
		System.out.println("售前.日志、事务");
		realSubject.request();
		System.out.println("售后、日志、事务");
	}
	@Override
	public void update() {
		System.out.println("售前.日志、事务");
		realSubject.update();
		System.out.println("售后、日志、事务");
	}
	

}
