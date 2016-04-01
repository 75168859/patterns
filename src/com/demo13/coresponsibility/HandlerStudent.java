package com.demo13.coresponsibility;

public class HandlerStudent implements Handler {
	// 下一个Handler对象
	private Handler nextSuccessor;

	public HandlerStudent(Handler nextSuccessor) {
	   this.nextSuccessor = nextSuccessor;
	}

	public void handleRequest(Request request) {
	   // 处理 StudentRequest
	   if (request.getType().equalsIgnoreCase("StudentRequest")) {
	    System.out.println("HandlerStudent begin to response StudentRequest;");
	    request.execute();
	   }
	   // 把请求传递给其它受理者
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

