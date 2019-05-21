package com.java.generic;

import java.util.ArrayList;
/**
 * 当一个类继承的父类或实现的接口是一个泛型类或泛型接口
 * 时,我们定义此类时要么传入实际类型,要么和父类或实现的
 * 接口使用相同的泛型.
 * @author ta
 *
 * @param <E>
 */
public class SynchronizedArrayList<E>
extends ArrayList<E>{

    @Override
    public synchronized boolean add(E e) {
    	// TODO Auto-generated method stub
    	return super.add(e);
    }
    @Override
    public synchronized E get(int index) {
    	// TODO Auto-generated method stub
    	return super.get(index);
    }

}
