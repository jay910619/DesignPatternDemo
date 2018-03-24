package com.example.jc.myapplication.singleton;

/**
 * @author jc
 * @time 2018/3/24 上午11:56
 * @desc 懒汉模式
 */

public class SingleTon1 {
  private static SingleTon1 sSingleTon;

  private SingleTon1() {
  }

  public static synchronized SingleTon1 getInstance() {
    if (sSingleTon == null) {
      sSingleTon = new SingleTon1();
    }
    return sSingleTon;
  }
}
