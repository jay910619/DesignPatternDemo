package com.example.jc.myapplication.singleton;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jc
 * @time 2018/3/24 下午12:11
 * @desc 单例模式测试类
 */

public class Test {

    public static void main(String[] args) {

        Show show = new Show();

        SingleTon singleTon = SingleTon.getInstance();
        SingleTon singleTon_ = SingleTon.getInstance();

        SingleTon1 singleTon1 = SingleTon1.getInstance();
        SingleTon1 singleTon1_ = SingleTon1.getInstance();

        SingleTon2 singleTon2 = SingleTon2.getInstance();
        SingleTon2 singleTon2_ = SingleTon2.getInstance();

        SingleTon3 singleTon3 = SingleTon3.getInstance();
        SingleTon3 singleTon3_ = SingleTon3.getInstance();

        SingleTonManager.registerService("test", singleTon);
        SingleTonManager.registerService("test1", singleTon1);
        SingleTonManager.registerService("test2", singleTon2);
        SingleTonManager.registerService("test3", singleTon3);

        SingleTon singleTonx = (SingleTon) SingleTonManager.getService("test");
        SingleTon1 singleTon1x = (SingleTon1) SingleTonManager.getService("test1");
        SingleTon2 singleTon2x = (SingleTon2) SingleTonManager.getService("test2");
        SingleTon3 singleTon3x = (SingleTon3) SingleTonManager.getService("test3");

        SingletonEnum singletonEnum = SingletonEnum.INSTANCE;
        singletonEnum.setTag("singletonEnum");
        SingletonEnum singletonEnum2 = SingletonEnum.INSTANCE;

        UnSingleTon unSingleTon = new UnSingleTon();
        UnSingleTon unSingleTon1 = new UnSingleTon();

        show.add(singleTon);
        show.add(singleTon_);
        show.add(singleTonx);
        show.add(singleTon1);
        show.add(singleTon1_);
        show.add(singleTon1x);
        show.add(singleTon2);
        show.add(singleTon2_);
        show.add(singleTon2x);
        show.add(singleTon3);
        show.add(singleTon3_);
        show.add(singleTon3x);

        show.add(singletonEnum);
        show.add(singletonEnum2);
        show.add(unSingleTon);
        show.add(unSingleTon1);

        show.showAll();
    }

    private static class Show {
        private List<Object> mObjectList = new ArrayList<>();

        public void add(Object o) {
            mObjectList.add(o);
        }

        public void showAll() {
            for (Object o : mObjectList) {
                System.out.println("Obj : " + o.toString());
            }
        }
    }
}
