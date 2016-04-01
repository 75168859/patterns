package com.miiceic.refactor.pattern.observer.variation;
public class Client
{
    private static ConcreteSubject subject;
    private static Observer observer;

    public static void main(String[] args)
    {
		subject = new ConcreteSubject();

        observer = new ConcreteObserver();
        Observer o1 = new Observer1();

        subject.attach(observer);
        subject.attach(o1);

        subject.change("new state");

    }
}