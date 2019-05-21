package com.java.modal.proxy;

public class TestProxy03 {

	public static void main(String[] args) {
		//定义一个代理工厂
		DaoProxyFactory factory=new DaoProxyFactory();
		//通过工厂为接口创建实现类对象(代理对象)
		SearchDao dao=
		factory.newProxy(SearchDao.class);
		//ystem.out.println(dao.getClass().getName());
		dao.search("tmooc");
	}
}
