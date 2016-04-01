package com.miiceic.refactor.pattern.observer.watching;

import java.util.Observable;
import java.util.Observer;

public class Watcher1 implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("watch1.....");
	}

}
