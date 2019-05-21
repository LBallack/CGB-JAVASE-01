package com.java.oop;

import java.util.List;
import java.util.Map;
//定义一查询接口
interface SearchService{//SearchService.class
	Object search(String key);
}
//定义一查询抽象类
abstract class AbsSearchService implements SearchService{
	public List<Map<String,Object>> find(String key){
		return null;
	}
}
//定义一查询具体类
class SearchServiceImpl extends AbsSearchService{

	public Object search(String key) {
		System.out.println("searching by key ...");
		return "search result : very good";
	}
}
public class TestExtends02 {
    public static void main(String[] args) {
    	SearchService s1=new SearchServiceImpl();
    	Object result=s1.search("key 1");
    	System.out.println(result);
	}
}
