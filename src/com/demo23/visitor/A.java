package com.demo23.visitor;

public class A implements Visitor {

@Override
public void visit(PartA A) {
   // TODO Auto-generated method stub
   System.out.println("A Ö÷¹Ü" + A.getName());
}

@Override
public void visit(PartB B) {
   // TODO Auto-generated method stub
}

}


