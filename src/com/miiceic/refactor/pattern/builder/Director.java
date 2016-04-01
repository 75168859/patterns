package com.miiceic.refactor.pattern.builder;
public class Director {   
   private AbstractBuilder builderA = new ConcreteBuilderA();   
    private AbstractBuilder builderB = new ConcreteBuilderB();   
       
    public AbstractProductionLine getProductA() {   
        builderA.buildCarParts();   
        //���������ӶԲ�Ʒ�������ȹ���   
       return builderA.buildCar();   
   }   
       
	public AbstractProductionLine getProductB(){   
        builderB.buildCarParts();   
        //���������ӶԲ�Ʒ�������ȹ���   
        return builderB.buildCar();   
   }  
}  