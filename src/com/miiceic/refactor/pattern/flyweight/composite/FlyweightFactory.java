package com.miiceic.refactor.pattern.flyweight.composite;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FlyweightFactory
{
    private HashMap flies = new HashMap();
    /**
     * @link aggregation
     * @directed
     * @clientRole Flyweights
     */
    private Flyweight lnkFlyweight;

	public FlyweightFactory(){}
    //享元工厂在多态性的基础上提供了两种不同的方法，一个用于提供单纯享元对象
	//另一个用于提供复合享元对象
	//复合享元工厂方法所以状态以参量形式传入 这个量巧合是String可以使集合
	public Flyweight factory(String compositeState)
	{ 
		ConcreteCompositeFlyweight compositeFly = new ConcreteCompositeFlyweight();
		
		int length = compositeState.length();
        Character state = null;

		for(int i = 0; i < length; i++)
		{ 
			state = new Character(compositeState.charAt(i) );
            System.out.println("factory(" + state + ")");
			compositeFly.add( state, this.factory( state) );
		}
		return compositeFly;
    }

	public Flyweight factory(Character state)
	{ 
		if ( flies.containsKey( state ) )
        {
            return (Flyweight) flies.get( state );
        }
        else
        {
			Flyweight fly = new ConcreteFlyweight( state );
            flies.put( state , fly);
            return fly;
        }
	}
	
	public void checkFlyweight()
	{ 
		Flyweight fly ;
        int i = 0 ;

        System.out.println("\n==========checkFlyweight()=============");
		for ( Iterator it = flies.entrySet().iterator() ; it.hasNext() ;  )
        {
			Map.Entry e = (Map.Entry) it.next();
            System.out.println( "Item " + (++i) + " : " + e.getKey());
        }
        System.out.println("\n==========checkFlyweight()=============");
	}

}
