package com.demo13.coresponsibility;

public class RequestSchoolmaster implements Request {

public void execute() {
   System.out.println("[RequestSchoolmaster] :\t Schoolmasters request has been accepted!");
}

public String getType() {
   return "SchoolmasterRequest";
}
}


