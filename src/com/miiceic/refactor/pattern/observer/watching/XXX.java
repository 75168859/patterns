package com.miiceic.refactor.pattern.observer.watching;

import java.util.Vector;

public class XXX {
	private Vector<Obs> obs = new Vector<Obs>();
	public void addObs(Obs ob){
		obs.add(ob);
	}
	public void notifyAllObs(){
		for(Obs ob : obs){
			ob.execute();
		}
	}
	public void logging(){
		
	}

}
