package com.java.oop;
//具体类
class ClassA{
	public void show(){
		System.out.println("ClassA");
	}
}
//抽象类
abstract class ClassB{
	public abstract void show();
}
//接口
interface ClassC{
	void show();//默认使用public abstract
}
public class TestInnerClass04 {
	static class ClassCImpl implements ClassC{
		@Override
		public void show() {
			
		}
	}
	static ClassC c2=new ClassC(){
		public void show() {};
	};
	static ClassC c3=new ClassCImpl();
	
	public static void main(String[] args) {
		ClassA a1=new ClassA();//正确
		//ClassB b1=new ClassB();//错误
		//ClassC c1=new ClassC();//错误
		//构建指定类型的子类类型或实现类对象
		//1.构建ClassA类型的子类对象
		ClassA a2=new ClassA(){//ClassA$1.class
			/*public void display(){
				super.show();
			}*/
		};//ClassA的子类对象
		ClassA a3=new ClassA(){//ClassA的子类对象
			@Override
			public void show() {
				System.out.println("classA.show()");
				super.show();//super指向谁?
			}
		};
		//2.构建ClassB类型的子类对象
		ClassB b1=new ClassB(){//此匿名内部类父类为抽象类ClassB
			@Override
			public void show() {
				System.out.println("classB.show()");
			    //super.show();//错误,父类不能构建对象
			}
		};
		//3.构建ClassC类型的实现类对象
		ClassC c1=new ClassC(){//构建的是接口的实现类对象
			@Override
			public void show() {
			  System.out.println("classC.show()");
			}
		};
		c1.show();
	}
}



