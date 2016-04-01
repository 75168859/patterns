package com.miiceic.refactor.pattern.flyweight.simple;

import java.util.HashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class CacheData {
	private Object value;
	private HashMap<String, Object> cache = new HashMap<String, Object>();
	ReentrantReadWriteLock rrwl = new ReentrantReadWriteLock();
	public Object getData(String key){
		rrwl.readLock().lock();
		try{
			value = cache.get(key);
			if(value==null){
				rrwl.readLock().unlock();
				rrwl.writeLock().lock();
				try{
					if(value==null){
					value = "...";
					cache.put(key, value);
					}
				}finally{
					rrwl.writeLock().unlock();
					rrwl.readLock().lock();
				}
			}
		}finally{
			rrwl.readLock().unlock();
		}
		
		if(value==null){
			value = "...";//后台获取
			cache.put(key, value);
		}
		return value;
	}
}
