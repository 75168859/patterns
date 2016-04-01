package com.miiceic.refactor.pattern.observer;

import java.util.Enumeration;
import java.util.Vector;

public class ConcreteSubject implements Subject
{

    /**
     * @associates <{Observer}>
     * @link aggregation
     * @supplierCardinality 0..*
     */
    private Vector observersVector = new java.util.Vector();

    public void attach(Observer observer)
    {
        observersVector.addElement(observer);
    }

    public void detach(Observer observer)
    {
        observersVector.removeElement(observer);
    }

    public void notifyObservers()
    {
		Enumeration enumeration = observers();
		while (enumeration.hasMoreElements())
        {
			((Observer)enumeration.nextElement()).update();
		}
	}

    public Enumeration observers()
    {
        return ((Vector) observersVector.clone()).elements();
    }
    private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(!name.equals(this.name)){
			notifyObservers();
		this.name = name;
		}
	}

	public ConcreteSubject(String name) {
		super();
		this.name = name;
	}
    

}
