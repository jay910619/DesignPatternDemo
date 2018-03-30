package com.example.jc.myapplication.Iterator;

/**
 * @author jc
 * @time 2018/3/30 上午11:31
 * @desc
 */

public class Granted implements OrderState {
  @Override public void addOrderLine() {

  }

  @Override public void register() {

  }

  @Override public void grant() {
    System.out.println(" 商家已接单");
  }

  @Override public void ship() {

  }

  @Override public void invoice() {

  }

  @Override public void finish() {

  }

  @Override public void cancel() {
    System.out.println(" 商家拒接单，订单已取消");
  }
}
