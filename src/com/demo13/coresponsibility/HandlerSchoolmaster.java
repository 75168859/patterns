package com.demo13.coresponsibility;

public class HandlerSchoolmaster implements Handler {

	// ��һ��Handler����
	private Handler nextSuccessor;

	public HandlerSchoolmaster(Handler nextSuccessor) {
	   this.nextSuccessor = nextSuccessor;
	}

	public void handleRequest(Request request) {
	   // ���� SchoolmasterRequest
	   if (request.getType().equalsIgnoreCase("SchoolmasterRequest")) {
	    System.out.println("HandlerSchoolmaster begin to response StudentRequest;");
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


