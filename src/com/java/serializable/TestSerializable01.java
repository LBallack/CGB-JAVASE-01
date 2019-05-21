package com.java.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Base64;
/**基于此对象存储用户行为日志*/
class SysLog implements Serializable{
	private static final long serialVersionUID = -5296788134693797316L;
	/**日志id*/
	private transient Integer id;
	/**操作用户*/
	private String username;
	//private Date createdTime;
	
	/**此方法会在调用对象流的的writeObject方法时执行*/
	private void writeObject(ObjectOutputStream out) throws IOException{
		//1.获取一个加密对象(java.util)
		Base64.Encoder encoder=Base64.getEncoder();
		//2.对内容进行加密
		byte[] array=encoder.encode(
				username.getBytes());
		//3.将加密结果重新赋值给username
		username=new String(array);
		//4.执行默认序列化
		out.defaultWriteObject();//序列化
	}//方法的声明是一种规范
	
	private void readObject(ObjectInputStream in)
		throws IOException, ClassNotFoundException{
		//1.执行默认反序列化
		in.defaultReadObject();
		//2.获取解密对象
		Base64.Decoder decoder=Base64.getDecoder();
		//3.执行解密操作
		byte[] array=decoder.decode(username);
		username=new String(array);
	}
	
	
	public void setId(Integer id) {
		this.id = id;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public String toString() {
		return "SysLog [id=" + id + ", username=" + username + "]";
	}
}
public class TestSerializable01 {
	public static void main(String[] args)throws Exception {
		//1.构建日志对象,并存储数据
		SysLog log=new SysLog();
		log.setId(1);
		log.setUsername("tmooc");
		//2.构建对象输出流,将日志对象存储到文件
		ObjectOutputStream out=
		new ObjectOutputStream(
		new FileOutputStream("f1.data"));
		out.writeObject(log);
		out.writeInt(100);//整数序列化
		System.out.println("序列化ok");
		out.close();
		//3.将文件中的日志数据读出
		ObjectInputStream in=
		new ObjectInputStream(new FileInputStream("f1.data"));
		SysLog obj=(SysLog)in.readObject();
		Integer result=in.readInt();//整数反序列化
		System.out.println(result);
		in.close();
		System.out.println(obj);
				
	}
}














