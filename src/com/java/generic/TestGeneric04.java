package com.java.generic;
/**
 * 类泛型:只能应用于实例方法,不能应用于静态方法
 * @author ta
 * @param <T>
 */
class ClassUtil<T>{
	/**
	 * 实例方法:此方法中的泛型由类泛型决定
	 * @param clazz
	 * @return
	 */
	public T newInstance(Class<T> clazz){
		return null;
	}
	/**
	 * 泛型方法:可以是静态方法,也可以是实例方法,
	 * 方法上的泛型只能作用域当前方法
	 */
	public static <E>void print(E t){
		System.out.println(t);
	}
}
public class TestGeneric04 {
	public static void main(String[] args) {
		ClassUtil<String> c1=new ClassUtil<String>();
		String o=c1.newInstance(String.class);
	}
}
