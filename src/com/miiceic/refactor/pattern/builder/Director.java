package com.miiceic.refactor.pattern.builder;
public class Director {   
   private AbstractBuilder builderA = new ConcreteBuilderA();   
    private AbstractBuilder builderB = new ConcreteBuilderB();   
       
    public AbstractProductionLine getProductA() {   
        builderA.buildCarParts();   
        //还可以增加对产品质量抽检等功能   
       return builderA.buildCar();   
   }   
       
	public AbstractProductionLine getProductB(){   
        builderB.buildCarParts();   
        //还可以增加对产品质量抽检等功能   
        return builderB.buildCar();   
   }  
}  