package com.example.jc.myapplication.Iterator;

/**
 * @author jc
 * @time 2018/3/30 上午11:59
 * @desc
 */

public class Finished implements OrderState {
  @Override public void addOrderLine() {

  }

  @Override public void register() {

  }

  @Override public void grant() {

  }

  @Override public void ship() {

  }

  @Override public void invoice() {

  }

  @Override public void finish() {
    System.out.println(" 订单已经完成");
  }

  @Override public void cancel() {

  }
}
