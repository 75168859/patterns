package com.demo13.coresponsibility;

//客户端
public class TestCoR {
	public void test(){
		// 这个handler的写法很少见！
				// 这就是生成的一条职责链
				Handler handler = new HandlerTeacher(new HandlerStudent(
						new HandlerSchoolmaster(null)));
				Request studentReq = new RequestStudent();
				Request teacherReq = new RequestTeacher();
				Request schoolmasterReq = new RequestSchoolmaster();
				Request presidentReq = new RequestPresident();
				// 传入student request
				handler.handleRequest(studentReq);
				System.out.println("-----------");
				// 传入teacher request
				handler.handleRequest(teacherReq);
				System.out.println("-----------");
				// 传入schoolmaster request
				handler.handleRequest(schoolmasterReq);
				System.out.println("-----------");
				// 传入president request
				handler.handleRequest(presidentReq);
				System.out.println("-----------");
	}
	public static void main(String[] args) {
		new TestCoR().test();
	}
}
