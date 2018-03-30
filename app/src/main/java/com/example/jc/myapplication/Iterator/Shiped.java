package com.example.jc.myapplication.Iterator;

/**
 * @author jc
 * @time 2018/3/30 上午11:31
 * @desc
 */

public class Shiped implements OrderState {
  @Override public void addOrderLine() {

  }

  @Override public void register() {

  }

  @Override public void grant() {

  }

  @Override public void ship() {
    System.out.println(" 商品已经整装待发");
  }

  @Override public void invoice() {

  }

  @Override public void finish() {

  }

  @Override public void cancel() {
    System.out.println(" 订单已取消");
  }
}
