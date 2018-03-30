package com.example.jc.myapplication.Iterator;

/**
 * @author jc
 * @time 2018/3/30 上午11:26
 * @desc
 */

public interface OrderState {

  /**
   * 新订单
   */
  void addOrderLine();

  /**
   * 已下单
   */
  void register();

  /**
   * 已接单
   */
  void grant();

  /**
   * 发货中
   */
  void ship();

  /**
   * 运输中
   */
  void invoice();

  /**
   *  完成
   */
  void finish();

  /**
   * 取消
   */
  void cancel();
}
