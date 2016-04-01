package com.demo23.visitor;

public class VisitorTest {

	
	public void test(){
		Visitor ceo = new CEO();
		Visitor a = new A();
		Visitor b = new B();
		Corporation pa = new PartA();
		Corporation pb = new PartB();

		ObjectStructure os = new ObjectStructure();
		os.addVisitor(pa);
		os.addVisitor(pb);

		os.accapt(ceo);
		os.accapt(a);
		os.accapt(b);
	}
	public static void main(String[] args) {
		new VisitorTest().test();
	}

}
