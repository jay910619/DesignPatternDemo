package com.example.jc.myapplication.Iterator;

/**
 * @author jc
 * @time 2018/3/30 上午11:30
 * @desc 未下单状态 仅可以下单
 */

public class NewOrder implements OrderState {
  @Override public void addOrderLine() {
    System.out.println(" 商品已经添加到购物车");
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

  }

  @Override public void cancel() {
    System.out.println(" 商品已经从购物车移除");
  }
}
