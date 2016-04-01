package com.miiceic.refactor.pattern.observer.watching;

import java.util.Observer;

public class Tester
{
	static private Watched watched;
	static private Observer watcher;

    public static void main(String[] args)
    {
		watched = new Watched();

        //watcher = new Watcher(watched);
		Watcher w1 = new Watcher();
		Watcher w2 = new Watcher();
		watched.addObserver(w1);
		watched.addObserver(w2);
        watched.addObserver(new Watcher1());
        
        watched.changeData("In C, we create bugs.");
       // watched.changeData("In Java, we inherit bugs.");
        //watched.changeData("In Java, we inherit bugs.");
        //watched.changeData("In Visual Basic, we visualize bugs.");
    }
}
