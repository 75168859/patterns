package com.miiceic.refactor.pattern.builder;
/**
 * 建造工人B
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
		System.out.println("-----生产线B完成一辆汽车零部件的生产----");
	}

	@Override
	public AbstractProductionLine buildCar() {
		System.out.println("----------完成一辆汽车B的组装调试----------");
		return productLineB;
	}

}