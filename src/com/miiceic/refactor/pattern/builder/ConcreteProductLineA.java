package com.miiceic.refactor.pattern.builder;
/**
 * ��ˮ��A
 */
public class ConcreteProductLineA extends AbstractProductionLine {

	@Override
	public void createEngine() {
		System.out.println("------------����С����������----------");
	}

	@Override
	public void createSecuritySystem() {
		System.out.println("----------������ͨ��׼�İ�ȫϵͳ-----------");
	}

	@Override
	public void createCarBody() {
		System.out.println("----------��������������-----------");
	}

}