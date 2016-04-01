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
            //老板来了, 通知员工A
        	return ca.action();
        }
        if (content.equals("client")) {
            //客户来了,通知前台B
        	return  cb.action();
        }
        return null;
    }
}
