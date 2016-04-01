package com.miiceic.refactor.pattern.proxy.staticProxy;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Subject subject = new RealSubject();
		//subject.update();
		//Subject subjectProxy = new SubjectProxy(subject);
		//ProxyFactoryBean factory = new ProxyFactoryBean(subject);
		//Subject subjectProxy = (Subject)factory.getProxy();
		
		//subjectProxy.request();
		
		//subjectProxy.update();
		Service service = new ServiceImpl();
		ProxyFactoryBean factory = new ProxyFactoryBean(service);
		//service.addOrder();
		Service serviceProxy =(Service) factory.getProxy();
		serviceProxy.addOrder();
	}

}
