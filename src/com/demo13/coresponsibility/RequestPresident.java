package com.demo13.coresponsibility;

public class RequestPresident implements Request {

public void execute() {
   System.out.println("[RequestPresident] :\t Presidents request has been accepted!");
}

public String getType() {
   return "PresidentRequest";
}
}




