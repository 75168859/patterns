package com.miiceic.refactor.pattern.factorymethod;

public class GrapeGardener implements FruitGardener{

	@Override
	public Fruit factory() {
		// TODO Auto-generated method stub
		return new Grape();
	}

}
