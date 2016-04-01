package com.miiceic.refactor.pattern.builder;
/**
 * 流水线B
 */
public class ConcreteProductLineB extends AbstractProductionLine {

	@Override
	public void createEngine() {
		System.out.println("------------生产标准排量的发动机----------");
	}

	@Override
	public void createSecuritySystem() {
		System.out.println("----------生产高标准的安全系统-----------");
	}

	@Override
	public void createCarBody() {
		System.out.println("----------生成汽车车身部件-----------");
	}

}