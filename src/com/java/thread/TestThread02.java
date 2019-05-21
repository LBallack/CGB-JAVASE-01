package com.java.thread;
public class TestThread02 {
	static void doMethod01(){
		while(true){
			System.out.println("doMethod01");
		}
	}
	static void doMethod02(){
		while(true){
			System.out.println("doMethod02");
		}
	}
	public static void main(String[] args) {
		new Thread(){
			@Override
			public void run() {
				doMethod01();
			}
		}.start();
		doMethod02();
	}
}
