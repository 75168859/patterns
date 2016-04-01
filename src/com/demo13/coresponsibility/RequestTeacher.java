package com.demo13.coresponsibility;

public class RequestTeacher implements Request {

public void execute() {
   System.out.println("[RequestTeacher] :\t Teachers request has been accepted!");
}

public String getType() {
   return "TeacherRequest";
}
}

