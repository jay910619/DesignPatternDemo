package com.example.jc.myapplication.singleton;

/**
 * @author jc
 * @time 2018/3/24 下午12:02
 * @desc 静态内部类实现
 */

public class SingleTon3 {
    private SingleTon3() {
    }

    public static SingleTon3 getInstance() {
        return SingletonHolder.sInstance;
    }

    private static class SingletonHolder {
        private static final SingleTon3 sInstance = new SingleTon3();
    }
}
