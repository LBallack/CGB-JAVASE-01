package com.java.oop;
class StaticExample05{
	static{
		System.out.println("StaticExample05");
	}
}
public class TestStatic05 {
	public static void main(String[] args)throws Exception {
		//显式类加载:方式1
		//Class.forName("com.java.oop.StaticExample05");
		//显式类加载:方式2
		ClassLoader loader=
		ClassLoader.getSystemClassLoader();//AppClassLoader
		//System.out.println(loader.getClass().getName());
		//loader.loadClass("com.java.oop.StaticExample05");
		Class.forName("com.java.oop.StaticExample05",
				true,//true会执行静态代码块
				loader);
		
		
	}
}
