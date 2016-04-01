package com.miiceic.refactor.pattern.proxy.staticProxy;

public class ServiceImpl implements Service{
	Dao dao = new Dao();
	@Override
	public void addOrder() {
		// TODO Auto-generated method stub
		dao.update();
		dao.delete();
		//...
	}

}
