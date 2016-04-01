package com.miiceic.refactor.pattern.iternum;

import java.awt.event.MouseAdapter;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Test {
	public static void main(String[] args) {
	}
}
interface A
{ 
	 void a();
	 void b();
	 void c();
	 void d();
	 void e();
}
abstract class Adapter implements A{
	public void a(){}
	public void b(){}
	public void c(){}
	public void d(){}
	public void e(){}
}
class A1 extends Adapter{
	public void a(){System.out.println("...");}
}