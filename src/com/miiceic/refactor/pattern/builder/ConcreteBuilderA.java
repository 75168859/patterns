package com.miiceic.refactor.pattern.builder;
/**
 * ���칤��A
 * @author Administrator
 *
 */
public class ConcreteBuilderA extends AbstractBuilder {
	private AbstractProductionLine productLineA = new ConcreteProductLineA();

	@Override
	public void buildCarParts() {
		productLineA.createEngine();
		productLineA.createSecuritySystem();
		productLineA.createCarBody();
		System.out.println("-----������A���һ�������㲿��������-----");
	}

	@Override
	public AbstractProductionLine buildCar() {
		System.out.println("----------���һ������A����װ����----------");
		return productLineA;
	}

}