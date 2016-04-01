package com.miiceic.refactor.pattern.proxy.da;

public class UserServiceImpl implements UserService{

	@Override
	public void login() {
		System.out.println("login...");
	}

	@Override
	public void update() {
		System.out.println("update...");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("delete...");
	}

}
