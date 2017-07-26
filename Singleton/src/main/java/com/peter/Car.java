package com.hin.singleton;

/**
 * 汽车类
 * 只生产一辆汽车
 * 定义一个getInstance方法，只允许访问它的唯一实例
 */
public class Car {
	
	// 静态方法为私有的，不能直接在外面new
	private Car(){}
	/**
	 * 静态工厂
	 * @return
	 */
	public static Car getInstance(){
		return SingletonHolder.INSTANCE;
	}

	static class SingletonHolder {
			public static final Car INSTANCE = new Car();
	}
}
