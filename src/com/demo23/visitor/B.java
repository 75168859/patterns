package com.demo23.visitor;

public class B implements Visitor {

	@Override
	public void visit(PartA A) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(PartB B) {
		// TODO Auto-generated method stub
		System.out.println("B Ö÷¹Ü" + B.getName());
	}
}
