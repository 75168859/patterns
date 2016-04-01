package com.miiceic.refactor.pattern.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class User implements Cloneable,Serializable{
	private Address address;
	public void setAddress(Address address) {
		this.address = address;
	}
	public Address getAddress() {
		return address;
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	public Object deepClone()throws Exception{
		ByteArrayOutputStream bao = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bao);
		oos.writeObject(this);
		
		ByteArrayInputStream bas = new ByteArrayInputStream(bao.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bas);
		return ois.readObject();
	}
}
