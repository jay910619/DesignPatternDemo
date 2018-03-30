package com.example.jc.myapplication.Iterator;

/**
 * @author jc
 * @time 2018/3/30 上午11:31
 * @desc
 */

public class Invoiced implements OrderState {
  @Override public void addOrderLine() {

  }

  @Override public void register() {

  }

  @Override public void grant() {

  }

  @Override public void ship() {

  }

  @Override public void invoice() {
    System.out.println(" 商品运输中");
  }

  @Override public void finish() {

  }

  @Override public void cancel() {
    System.out.println(" 订单已取消");
  }
}
