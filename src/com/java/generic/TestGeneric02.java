package com.java.generic;

interface Task<Param,Result>{
	Result execute(Param arg);
}
class AsyncTask implements Task<Integer,Integer>{
	@Override
	public Integer execute(Integer arg) {
		int result=0;
		for(int i=1;i<=arg;i++){
			if(i%2!=0){
				result+=i;
			}
		}
		return result;
	}
}

abstract class ConvertTask<Param,Result>
   implements Task<Param,Result>{
}
class SubConvertTask extends ConvertTask<String,Integer>{
	@Override
	public Integer execute(String arg) {
		return Integer.parseInt(arg);
	}
}
public class TestGeneric02 {
   public static void main(String[] args) {
	   AsyncTask task=new AsyncTask();
	   Integer result=task.execute(10);
	   System.out.println(result);
	   //============================
	   ConvertTask<String,Integer> task1=
	   new SubConvertTask();
	   Integer result1=task1.execute("123456");
	   System.out.println(result1);
   }
}
