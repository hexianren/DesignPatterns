package com.peter;

/**
 * 轮船类
 * 只生产一艘轮船
 * 双重锁模式
 */
public class Ship {

	//volatile
	private static volatile Ship mInstance = null;
	// 静态方法为私有的，不能直接在外面new
	private Ship(){}

	public static Ship getInstance(){
		if (mInstance == null) {//双重锁
			synchronized(Ship.class) {
				if (mInstance == null) {
					mInstance = new Ship();
				}
			}
		}
		
		return mInstance;
	}
}
