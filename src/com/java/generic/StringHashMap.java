package com.java.generic;
import java.util.HashMap;
/**
 * 自定义map,key必须为String类型,值没有要求
 * @author ta
 * @param <V>
 */
public class StringHashMap<V> 
       extends HashMap<String,V> {

	@Override
	public V put(String key, V value) {
		return super.put(key, value);
	} 
	public static void main(String[] args) {
		StringHashMap<Integer> map=
	    new StringHashMap<Integer>();
		map.put("k0", 100);
	} 
}
