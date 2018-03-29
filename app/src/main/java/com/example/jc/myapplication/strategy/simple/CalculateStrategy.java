package com.example.jc.myapplication.strategy.simple;

/**
 * @author jc
 * @time 2018/3/29 下午5:43
 * @desc
 */

public interface CalculateStrategy {

  /**
   * 根据距离计算价格
   *
   * @param km 公里 路程
   * @return 价格
   */
  int calculatePrice(int km);
}
