package com.java.oop;
class Outer03{//corejava (java 核心)
	int a;
	static int b;
	public void create(){
		/**
		 * 局部内部类(应用较少)
		 * 位置:方法内部
		 * 修饰:不能使用static修饰,不能使用访问修饰符
		 * 应用:只限于方法内部,允许访问外部类所有成员
		 */
		 class Inner03{
			 //static int c=100;错误
			 int c=300;
			 public void display(){
				 System.out.println(this);
				 System.out.println(Outer03.this);
				 System.out.println(a);
				 System.out.println(b);
			 }
		 }//此类中不允许定义static成员(类变量,类方法)
		 //只限于方法内部构建此类对象.
		 new Inner03().display();
	}
	public void newInstance(){
		//new Inner03(); 错误,不可见
	}
}
public class TestInnerClass03 {
	public static void main(String[] args) {
		new Outer03().create();
	}
}
