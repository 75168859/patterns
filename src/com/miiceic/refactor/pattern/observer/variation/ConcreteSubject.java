package com.miiceic.refactor.pattern.observer.variation;
public class ConcreteSubject extends Subject
{
    private String state;

    public void change(String newState)
    {
        state = newState;

        this.notifyObservers();
    }
}
