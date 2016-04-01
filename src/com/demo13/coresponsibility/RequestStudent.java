package com.demo13.coresponsibility;

public class RequestStudent implements Request {

public void execute() {
   System.out.println("[RequestStudent] :\t Students request has been accepted!");
}

public String getType() {
   return "StudentRequest";
}
}


