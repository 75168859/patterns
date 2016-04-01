package com.demo13.coresponsibility;

public class HandlerStudent implements Handler {
	// ��һ��Handler����
	private Handler nextSuccessor;

	public HandlerStudent(Handler nextSuccessor) {
	   this.nextSuccessor = nextSuccessor;
	}

	public void handleRequest(Request request) {
	   // ���� StudentRequest
	   if (request.getType().equalsIgnoreCase("StudentRequest")) {
	    System.out.println("HandlerStudent begin to response StudentRequest;");
	    request.execute();
	   }
	   // �����󴫵ݸ�����������
	   else {
	    if (this.nextSuccessor != null) {
	     nextSuccessor.handleRequest(request);
	    } else {
	     System.out.println("request[" + request.getType()
	       + "] has not handler to deal!");
	    }
	   }
	}
	}

