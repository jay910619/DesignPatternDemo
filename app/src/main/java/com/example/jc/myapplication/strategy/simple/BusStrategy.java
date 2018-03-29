package com.example.jc.myapplication.strategy.simple;

/**
 * @author jc
 * @time 2018/3/29 下午6:51
 * @desc
 */

public class BusStrategy implements CalculateStrategy {
  @Override public int calculatePrice(int km) {
    int extraTotal = km - 10;
    //  超出10km部分  每5km需额外付1元 不足5km按照5km计算
    int extraFactor = extraTotal / 5;
    int fraction = extraTotal % 5;
    int price = 1 + extraFactor * 1;

    return fraction > 0 ? ++price : price;
  }
}
