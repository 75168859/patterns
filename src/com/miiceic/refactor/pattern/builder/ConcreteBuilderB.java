package com.miiceic.refactor.pattern.builder;
/**
 * ���칤��B
 * @author Administrator
 *
 */
public class ConcreteBuilderB extends AbstractBuilder {
	private AbstractProductionLine productLineB = new ConcreteProductLineB();

	@Override
	public void buildCarParts() {
		productLineB.createEngine();
		productLineB.createSecuritySystem();
		productLineB.createCarBody();
		System.out.println("-----������B���һ�������㲿��������----");
	}

	@Override
	public AbstractProductionLine buildCar() {
		System.out.println("----------���һ������B����װ����----------");
		return productLineB;
	}

}