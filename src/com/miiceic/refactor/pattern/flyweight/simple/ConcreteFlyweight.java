package com.miiceic.refactor.pattern.flyweight.simple;
public class ConcreteFlyweight extends Flyweight
{
	static{
		
	}
    private Character intrinsicState = null;

    //构造函数，内蕴状态作为参数传入
	public ConcreteFlyweight(Character state)
	{ 
		this.intrinsicState = state;
	}
	//外蕴状态通过参数传入方法中，改变方法的行为，但不改变对象的内蕴状态
	public void operation(String state)
	{ 
		System.out.print( "\nIntrinsic State = " + intrinsicState +
            ", Extrinsic State = " + state);
	}
	//客户端不可直接将具体享元类实例化
}