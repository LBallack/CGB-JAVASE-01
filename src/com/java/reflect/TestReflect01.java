package com.java.reflect;

import java.lang.reflect.Constructor;

class Point{
	private int x;
	private int y;
	static{
		System.out.println("Point.static");
	}//Point.class方式加载类时不会执行static代码块
	public Point() {}
	public Point(int x,int y){
		this.x=x;
		this.y=y;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
}
public class TestReflect01 {
	public static void main(String[] args) 
			throws Exception {
		//1.类对象(字节码对象)获取
		doLoadClass();
		//2.基于类对象构建类的实例对象
		Point p1=doCreateInstance(Point.class);
	    System.out.println(p1);
	   //3.基于类对象构建类的实例对象
	    Point p2=doCreateInstance(Point.class,
	    		new Object[]{10,20},
	    		new Class[]{int.class,int.class});
	    System.out.println(p2);
	}
	//基于类的字节码对象创建类的实例对象
	private static <T>T doCreateInstance(
			Class<T> cls) throws Exception{
		//1.获取类中的构造方法对象
		Constructor<T> con=
		cls.getDeclaredConstructor();
		//2.基于构造方法对象构建类的实例对象
		con.setAccessible(true);//设置构造方法可访问
		return (T)con.newInstance();//默认调用无参构造函数
	}
	
	//基于类的字节码对象创建类的实例对象
	@SuppressWarnings("unused")
	private static <T>T doCreateInstance(
			Class<T> cls,//字节码对象
			Object[] args,//创建实例对象需要的实际参数
			Class<?>[] paramTypes)throws Exception {
		//1.获取构造方法对象
		Constructor<T> con=
		cls.getDeclaredConstructor(paramTypes);
		
		//2.基于构造方法对象构建类的实例对象
		return con.newInstance(args);
	}
	
	//获取类对象
	private static void doLoadClass() throws ClassNotFoundException {
		Class<Point> c1=Point.class;//不会执行static代码块
		Class<?> c2=Class.forName("com.java.reflect.Point");
		/*Class<?> c3=new Point().getClass();
		System.out.println(c1==c2);
		System.out.println(c1==c3);*/
	}
}



