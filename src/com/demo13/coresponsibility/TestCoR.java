package com.demo13.coresponsibility;

//�ͻ���
public class TestCoR {
	public void test(){
		// ���handler��д�����ټ���
				// ��������ɵ�һ��ְ����
				Handler handler = new HandlerTeacher(new HandlerStudent(
						new HandlerSchoolmaster(null)));
				Request studentReq = new RequestStudent();
				Request teacherReq = new RequestTeacher();
				Request schoolmasterReq = new RequestSchoolmaster();
				Request presidentReq = new RequestPresident();
				// ����student request
				handler.handleRequest(studentReq);
				System.out.println("-----------");
				// ����teacher request
				handler.handleRequest(teacherReq);
				System.out.println("-----------");
				// ����schoolmaster request
				handler.handleRequest(schoolmasterReq);
				System.out.println("-----------");
				// ����president request
				handler.handleRequest(presidentReq);
				System.out.println("-----------");
	}
	public static void main(String[] args) {
		new TestCoR().test();
	}
}
