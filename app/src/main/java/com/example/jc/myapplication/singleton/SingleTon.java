package com.example.jc.myapplication.singleton;

/**
 * @author jc
 * @time 2018/3/24 下午12:41
 * @desc
 */

public class SingleTon {
  private static SingleTon sSingleTon = new SingleTon();

  private SingleTon() {
  }

  public static SingleTon getInstance() {
    return sSingleTon;
  }
}
