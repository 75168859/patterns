package com.demo17.mediator;

public class MedTest {
	public static void main(String[] args) {
        Mediator med = new ConcreteMediator();
        //�ϰ�����
        med.notice("boss");
        //�ͻ�����
        med.notice("client");
    }

}
