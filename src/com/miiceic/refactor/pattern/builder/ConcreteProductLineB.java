package com.miiceic.refactor.pattern.builder;
/**
 * ��ˮ��B
 */
public class ConcreteProductLineB extends AbstractProductionLine {

	@Override
	public void createEngine() {
		System.out.println("------------������׼�����ķ�����----------");
	}

	@Override
	public void createSecuritySystem() {
		System.out.println("----------�����߱�׼�İ�ȫϵͳ-----------");
	}

	@Override
	public void createCarBody() {
		System.out.println("----------��������������-----------");
	}

}