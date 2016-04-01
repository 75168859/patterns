package com.demo17.mediator;

//ConcreteMediator 
public class ConcreteMediator extends Mediator {

    private ColleagueA ca;
    
    private ColleagueB cb;
    
    public ConcreteMediator() {
        ca = new ColleagueA();
        cb = new ColleagueB();
    }
    
    public String notice(String content) {
        if (content.equals("boss")) {
            //�ϰ�����, ֪ͨԱ��A
        	return ca.action();
        }
        if (content.equals("client")) {
            //�ͻ�����,֪ͨǰ̨B
        	return  cb.action();
        }
        return null;
    }
}
