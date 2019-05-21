package com.java.thread;

public class TestThread03 {

	static String content;
	public static void main(String[] args) {
		Thread main=Thread.currentThread();
		System.out.println(main.getName());
		new Thread(){
			@Override
			public void run() {
				content="hello";
			}
		}.start();
		while(content==null)Thread.yield();//放弃cpu,处于就绪态
		System.out.println(content.toUpperCase());
	}
}
