package com.miiceic.refactor.pattern.builder;
/**
 * 流水线A
 */
public class ConcreteProductLineA extends AbstractProductionLine {

	@Override
	public void createEngine() {
		System.out.println("------------生产小排量发动机----------");
	}

	@Override
	public void createSecuritySystem() {
		System.out.println("----------生产普通标准的安全系统-----------");
	}

	@Override
	public void createCarBody() {
		System.out.println("----------生成汽车车身部件-----------");
	}

}