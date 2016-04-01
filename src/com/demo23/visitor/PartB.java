package com.demo23.visitor;

public class PartB implements Corporation {
	String s = "PartB";

	@Override
	public void accapt(Visitor v) {
	   // TODO Auto-generated method stub
	   v.visit(this);
	}

	public String getName() {
	   // TODO Auto-generated method stub
	   return s;
	}
	}


