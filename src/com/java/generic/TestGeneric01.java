package com.java.generic;
import java.util.ArrayList;
import java.util.List;
class Container<T>{
	public void add(T t){}
	public  T get(){
		return null;
	}
}
public class TestGeneric01 {
	public static void main(String[] args) {
		//doMethod01();
	}
	private static void doMethod02(){
		Container<Integer> c1=new Container<>();
	    c1.add(100);
	    Integer t1=c1.get();
	}
	private static void doMethod01() {
		List list0=new ArrayList();
		List<String> list1=new ArrayList<String>();
		List<String> list2=new ArrayList<>();//JDK1.7
		ArrayList<Integer> list3=new ArrayList<>();
		list1.add("ABCD");
		String s1=list1.get(0);
		list0.add("ABCD");
		String s2=(String)list0.get(0);
	}
}








