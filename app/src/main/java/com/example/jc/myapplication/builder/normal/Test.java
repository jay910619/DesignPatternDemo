package com.example.jc.myapplication.builder.normal;

/**
 * @author jc
 * @time 2018/3/26 上午10:36
 * @desc
 */

public class Test {
  public static void main(String[] args) {
    WaiterX waiterX = new WaiterX.Builder().setFood("香辣鸡腿堡")
        .setDrink("可乐")
        .setType(2)
        .setRemark("少盐")
        .setCount(3)
        .create();
    System.out.println(waiterX.toString());

  }
}
