package com.miiceic.refactor.pattern.builder;

public abstract class AbstractProductionLine {
	// 生产汽车发动机
	public abstract void createEngine();

	// 生产汽车安全系统
	public abstract void createSecuritySystem();

	// 生产汽车车身
	public abstract void createCarBody();
}