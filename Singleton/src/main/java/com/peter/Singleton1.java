package com.peter;

/**
 * Created by peter on 2017/7/31.
 */
public class Singleton1 {

    private Singleton1(){}

    public static Singleton1 getInstance() {
        return SingletonHolder.INSTANCE;
    }
    static class SingletonHolder {
       static final Singleton1 INSTANCE = new Singleton1();
    }
}
