package com.miiceic.refactor.pattern.builder;

public abstract class AbstractBuilder {
	// ����1���������������㲿������������
	public abstract void buildCarParts();

	// ����2��������1�������㲿����װ������������
	public abstract AbstractProductionLine buildCar();
}