package com.example.jc.myapplication.strategy.simple;

/**
 * @author jc
 * @time 2018/3/29 下午5:45
 * @desc
 */

public class SubwayStrategy implements CalculateStrategy {
  @Override public int calculatePrice(int km) {
    int extraTotal = km - 6;
    int extraFactor = extraTotal / 5;
    if (km < 6) {
      return 3;
    } else {
      return 3 + extraFactor;
    }
  }
}
