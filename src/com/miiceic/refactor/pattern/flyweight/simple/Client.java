package com.miiceic.refactor.pattern.flyweight.simple;
public class Client
{
    private static FlyweightFactory factory;

    static public void main(String[] args)
	{ 
    	//����һ����Ԫ��������
		factory = new FlyweightFactory();
        //����Ԫ������������һ������״̬Ϊ'a'����Ԫ����
		Flyweight fly = factory.factory(new Character('a'));
		//�Բ�����ʽ����һ������״̬
		fly.operation("First Call");
		
		fly = factory.factory(new Character('b'));
		fly.operation("Second Call");
		
		fly = factory.factory(new Character('a'));
		fly.operation("Third Call");
		
		// intrinsic Flyweight
		factory.checkFlyweight();
	} 
}
