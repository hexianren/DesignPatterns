package com.peter;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by peter on 2017/7/31.
 */
public class Singleton3 {
    private volatile Singleton3 instance = null;
    private Singleton3(){}

    public Singleton3 getInstance() {
        if (instance == null) {
            synchronized (Singleton3.class) {
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }

}
