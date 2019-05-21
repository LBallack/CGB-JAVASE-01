package com.java.generic;
import java.util.HashMap;

public class SynchronizedHashMap<K,V> 
extends HashMap<K, V>{

	@Override
	public synchronized V put(K key, V value) {
		// TODO Auto-generated method stub
		return super.put(key, value);
	}
	@Override
	public synchronized V get(Object key) {
		// TODO Auto-generated method stub
		return super.get(key);
	}
}
