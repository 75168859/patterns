package com.miiceic.refactor.pattern.builder;
/**
 * 建造工人A
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
		System.out.println("-----生产线A完成一辆汽车零部件的生产-----");
	}

	@Override
	public AbstractProductionLine buildCar() {
		System.out.println("----------完成一辆汽车A的组装调试----------");
		return productLineA;
	}

}