package com.java.generic;
/**
 * 泛型方法:
 * 访问修饰符 <泛型>返回值类型 方法名(参数列表){}
 * @author ta
 */
class DefaultSqlSession{
	/**泛型方法*/
	public <T>T getMapper(Class<T> cls){
		return null;
	}
}
class ClassPathXmlApplicationContext{
	//写一个getBean方法(仿照spring官方)
    public <T>T getBean(Class<T> cls){
		return null;
	}
    public <T>T getBean(String id,Class<T> cls){
    	return null;
    }
}
class ContainerUtil{
	/**只要方法的返回值类型左侧有<泛型>,就是泛型方法*/
	<M>void add(M t){}
}
interface SearchDao{}//测试接口(随意写)SearchDao.class
interface UserDao{}
public class TestGeneric03 {
	public static void main(String[] args) {
		DefaultSqlSession s=
	    new DefaultSqlSession();
		SearchDao obj=s.getMapper(SearchDao.class);
		UserDao ud=s.getMapper(UserDao.class);
	}
}


