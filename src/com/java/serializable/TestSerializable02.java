package com.java.serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerializable02 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		//构建对象
		Message msg=new Message();
		msg.setId(100);
		msg.setTitle("title-aaa");
		msg.setContent("content--aaa");
		msg.setCreatedTime("2019-02-28 16:12:12");
		//2.构建对象输出流,将日志对象存储到文件
		ObjectOutputStream out=
				new ObjectOutputStream(
						new FileOutputStream("f1.data"));
		out.writeObject(msg);
		System.out.println("序列化ok");
		out.close();
		//3.将文件中的日志数据读出
		ObjectInputStream in=
				new ObjectInputStream(new FileInputStream("f1.data"));
		Object obj=in.readObject();
		System.out.println(obj);
		in.close();
		System.out.println(obj);
	}
}
