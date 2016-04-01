package com.miiceic.refactor.pattern.flyweight.simple;
public class Client
{
    private static FlyweightFactory factory;

    static public void main(String[] args)
	{ 
    	//创建一个享元工厂对象
		factory = new FlyweightFactory();
        //向享元工厂对象请求一个内蕴状态为'a'的享元对象
		Flyweight fly = factory.factory(new Character('a'));
		//以参量方式传入一个外蕴状态
		fly.operation("First Call");
		
		fly = factory.factory(new Character('b'));
		fly.operation("Second Call");
		
		fly = factory.factory(new Character('a'));
		fly.operation("Third Call");
		
		// intrinsic Flyweight
		factory.checkFlyweight();
	} 
}
