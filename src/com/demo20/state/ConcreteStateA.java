package com.demo20.state;

public class ConcreteStateA implements State {

    @Override
    public void handle(String sampleParameter) {
        System.out.println("ConcreteStateA handle £º" + sampleParameter);
    }

}