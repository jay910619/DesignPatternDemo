package com.example.jc.myapplication.singleton;

/**
 * @author jc
 * @time 2018/3/24 上午11:59
 * @desc DCL实现 （double check lock）
 */

public class SingleTon2 {
  private static volatile SingleTon2 sSingleTon2 = null;

  private SingleTon2() {
  }

  public static SingleTon2 getInstance() {
    if (sSingleTon2 == null) {
      synchronized (SingleTon2.class) {
        if (sSingleTon2 == null) {
          sSingleTon2 = new SingleTon2();
        }
      }
    }

    return sSingleTon2;
  }
}
