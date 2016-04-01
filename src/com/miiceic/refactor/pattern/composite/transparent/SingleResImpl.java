package com.miiceic.refactor.pattern.composite.transparent;
public class SingleResImpl implements IRes {
 
    /**��Ʒ����*/
    private String name;
 
    /**��Ǯ*/
    private float money;
 
    public SingleResImpl(String name, float money) {
        this.name = name;
        this.money = money;
    }
 
    public void pay() {
        System.out.println("������һ����Ʒ["+getName()+"],��Ǯ��[" + getMoney()+"]Ԫ");
    }
 
    public float getMoney() {
        // TODO �Զ����ɷ������
        return this.money;
    }
 
    public String getName() {
        // TODO �Զ����ɷ������
        return this.name;
    }
    
    /**��дequals*/
    public boolean equals(Object obj){
        SingleResImpl res = (SingleResImpl)obj;     
        return res.getName().equals(getName()) && res.getMoney()==getMoney();
    }

	@Override
	public void addRes(IRes res) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeRes(IRes res) {
		// TODO Auto-generated method stub
		
	}
}
 
