package com.java.generic;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
public class TestGeneric07 {
	public static void main(String[] args)throws Exception {
		//泛型是编译时一种类型,运行时无效
		List<String> list=new ArrayList<String>();
		list.add("A");
		list.add("B");
		//list.add(100);
		//作业:基于各位学过的反射技术将100添加到list集合
		//1.获取反射应用的起点对象
		Class<?> cls=list.getClass();
		//2.基于类对象获取add方法对象
		Method method=
		cls.getDeclaredMethod("add",//方法名
				Object.class);//参数类型
		//3.执行list集合的add方法
		method.invoke(list, 100);
		method.invoke(list, true);
		System.out.println(list);//[A,B,100];
	}
}
