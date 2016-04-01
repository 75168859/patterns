package com.demo13.coresponsibility;

public class HandlerTeacher implements Handler {

	// ��һ��Handler����
	private Handler nextSuccessor;

	public HandlerTeacher(Handler nextSuccessor) {
	   this.nextSuccessor = nextSuccessor;
	}

	public void handleRequest(Request request) {
	   // ���� TeacherRequest
	   if (request.getType().equalsIgnoreCase("TeacherRequest")) {
	    System.out.println("HandlerTeacher begin to response StudentRequest;");
	    request.execute();
	    // �����󴫵ݸ�����������
	   } else {
	    if (this.nextSuccessor != null) {
	     nextSuccessor.handleRequest(request);
	    } else {
	     System.out.println("request[" + request.getType()
	       + "] has not handler to deal!");
	    }
	   }
	}
	}

