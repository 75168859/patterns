package com.demo17.mediator;

public class MedTest {
	public static void main(String[] args) {
        Mediator med = new ConcreteMediator();
        //老板来了
        med.notice("boss");
        //客户来了
        med.notice("client");
    }

}
