package com.miiceic.refactor.pattern.builder;

public abstract class AbstractBuilder {
	// 命令1：启动生产汽车零部件生产线命令
	public abstract void buildCarParts();

	// 命令2：将命令1生产的零部件组装成完整的汽车
	public abstract AbstractProductionLine buildCar();
}