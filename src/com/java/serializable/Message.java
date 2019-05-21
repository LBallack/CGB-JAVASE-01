package com.java.serializable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
/**
 * 通过让类实现Externalizable 来指定需要序列化
 * 和反序列化的属性
 */
public class Message implements Externalizable{
	private Integer id;//10
	private String title;
	private String content;
	private String createdTime;
	//序列化时调用
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
       out.writeUTF(title);
	}
	//反序列化调用
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
       title=in.readUTF();
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}
	@Override
	public String toString() {
		return "Message [id=" + id + ", title=" + title + ", content=" + content + ", createdTime=" + createdTime
				+ "]";
	}

     

}
