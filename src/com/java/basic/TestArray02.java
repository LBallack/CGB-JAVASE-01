package com.java.basic;
import java.util.ArrayList;
import java.util.List;
public class TestArray02 {
	public static void doTestArray(int []array){
		if(array==null||array.length==0)
		throw new RuntimeException("array is empty");
	}
	public static void main(String[] args) {
		//泛型必须为对象类型
		//List<int> list=new ArrayList<int>(); 错误
		List<Integer> list=
		new ArrayList<Integer>(100);//Object[]
		list.add(10);
		//输出有效元素个数(添加到集合中的元素)
		System.out.println(list.size());//1
		doTestArray(null);
	}
}




