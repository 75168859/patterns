package com.demo23.visitor;

public class CEO implements Visitor {

@Override
public void visit(PartA A) {
   // TODO Auto-generated method stub
   System.out.println("CEO����" + A.getName());
}

@Override
public void visit(PartB B) {
   // TODO Auto-generated method stub
   System.out.println("CEO����" + B.getName());
}
}


