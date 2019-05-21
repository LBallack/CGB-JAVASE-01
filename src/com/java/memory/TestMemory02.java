package com.java.memory;
class Activity{
	//实例内部类可能会导致内存泄漏
	static class WorkThread extends Thread{
		@Override
		public void run() {
			//System.out.println(Activity.this);
			//while(true){}
		}
	}
	public void onCreate(){
		//this.new WorkThread().start();
		new WorkThread().start();
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("==finalize()==");
	}
}
public class TestMemory02 {
	public static void main(String[] args) {
      	Activity aty=new Activity();
      	aty.onCreate();
      	aty=null;
      	//....
      	//当对象不可访问,但还占用着内存,这种现象称之为内存泄漏
      	System.gc();//启动GC
	}
}




