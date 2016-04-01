package com.miiceic.refactor.pattern.chain;

public class Client {
	public static void main(String[] args) {
		// 先要组装职责链
		Handler h1 = new GeneralManager();
		Handler h2 = new DepManager();
		Handler h3 = new ProjectManager();
		h3.setSuccessor(h2);
		h2.setSuccessor(h1);

		// 开始测试
		String ret1 = h3.handleFeeRequest("小李", 3000);
		System.out.println("the ret1=" + ret1);

		String ret2 = h3.handleFeeRequest("小张", 3000);
		System.out.println("the ret2=" + ret2);
	}
}