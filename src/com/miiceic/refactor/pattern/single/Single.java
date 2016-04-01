package com.miiceic.refactor.pattern.single;

public class Single {
	private Single(){}
	private static Single single = null;
	public static synchronized Single getInstance(){
		if(single==null)
			single = new Single();
		return single;
	}

}
class Single1{
	private Single1(){}
	private static Single1 single = new Single1();
	public static Single1 getInstance(){
		return single;
	}
}

enum Single2{
	single;
}
enum Yy{
	y1{
		@Override
		public Yy nextDay() {
			// TODO Auto-generated method stub
			return null;
		}
	},y2(){
		@Override
		public Yy nextDay() {
			// TODO Auto-generated method stub
			return null;
		}
	},y3(){
		@Override
		public Yy nextDay() {
			// TODO Auto-generated method stub
			return null;
		}
	};
	public abstract Yy nextDay();
}



