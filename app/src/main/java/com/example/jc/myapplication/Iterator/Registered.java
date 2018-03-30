package com.example.jc.myapplication.Iterator;

/**
 * @author jc
 * @time 2018/3/30 上午11:30
 * @desc 已经下单状态，
 * 可以取消订单、发送给商家接单、继续添加订单
 */

public class Registered implements OrderState {
  @Override public void addOrderLine() {
    System.out.println(" 商品已经添加到购物车");
  }

  @Override public void register() {
    System.out.println(" 已下单");
  }

  @Override public void grant() {

  }

  @Override public void ship() {

  }

  @Override public void invoice() {

  }

  @Override public void finish() {

  }

  @Override public void cancel() {
    System.out.println(" 订单取消");
  }
}
