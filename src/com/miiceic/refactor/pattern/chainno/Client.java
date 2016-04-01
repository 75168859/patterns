package com.miiceic.refactor.pattern.chainno;

public class Client {
	public static void main(String[] args) {
		FeeRequest request = new FeeRequest();

		// 开始测试
		String ret1 = request.requestToProjectManager("小李", 300);
		System.out.println("the ret1=" + ret1);
		String ret2 = request.requestToProjectManager("小张", 300);
		System.out.println("the ret2=" + ret2);

	}
}