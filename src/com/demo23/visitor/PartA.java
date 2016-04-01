package com.demo23.visitor;

public class PartA implements Corporation{
	String s = "PartA";

	@Override
	public void accapt(Visitor v) {
	   v.visit(this);
	}

	public String getName() {
		   return s;
		}

}
