package com.miiceic.refactor.pattern.flyweight.simple;
public class ConcreteFlyweight extends Flyweight
{
	static{
		
	}
    private Character intrinsicState = null;

    //���캯��������״̬��Ϊ��������
	public ConcreteFlyweight(Character state)
	{ 
		this.intrinsicState = state;
	}
	//����״̬ͨ���������뷽���У��ı䷽������Ϊ�������ı���������״̬
	public void operation(String state)
	{ 
		System.out.print( "\nIntrinsic State = " + intrinsicState +
            ", Extrinsic State = " + state);
	}
	//�ͻ��˲���ֱ�ӽ�������Ԫ��ʵ����
}