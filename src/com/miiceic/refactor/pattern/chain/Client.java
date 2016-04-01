package com.miiceic.refactor.pattern.chain;

public class Client {
	public static void main(String[] args) {
		// ��Ҫ��װְ����
		Handler h1 = new GeneralManager();
		Handler h2 = new DepManager();
		Handler h3 = new ProjectManager();
		h3.setSuccessor(h2);
		h2.setSuccessor(h1);

		// ��ʼ����
		String ret1 = h3.handleFeeRequest("С��", 3000);
		System.out.println("the ret1=" + ret1);

		String ret2 = h3.handleFeeRequest("С��", 3000);
		System.out.println("the ret2=" + ret2);
	}
}