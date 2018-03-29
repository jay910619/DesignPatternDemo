package com.example.jc.myapplication.strategy.simple;

/**
 * @author jc
 * @time 2018/3/29 下午5:54
 * @desc
 */

public class PriceCalculator {

  public static final int BUS = 1;
  public static final int TAIX = 2;
  public static final int SUBWAY = 3;

  public static void main(String[] args) {
    PriceCalculator calculator = new PriceCalculator();
    System.out.println("坐16公里公交车票价：" + calculator.calculatorPrice(16, PriceCalculator.BUS));
    System.out.println("坐16公里出租车票价：" + calculator.calculatorPrice(16, PriceCalculator.TAIX));
    System.out.println("坐地铁票价：" + calculator.calculatorPrice(16, PriceCalculator.SUBWAY));
  }

  private int busPrice(int km) {
    int extraTotal = km - 10;
    //  超出10km部分  每5km需额外付1元 不足5km按照5km计算
    int extraFactor = extraTotal / 5;
    int fraction = extraTotal % 5;
    int price = 1 + extraFactor * 1;

    return fraction > 0 ? ++price : price;
  }

  private int taxiPrice(int km) {
    //10km内按起步价10元收费，超出部分每公里收费2元
    if (km < 10) {
      return 12;
    } else {
      return 16 + (km - 10) * 2;
    }
  }

  private int subPrice(int km) {
    int extraTotal = km - 6;
    int extraFactor = extraTotal / 5;
    if (km < 6) {
      return 3;
    } else {
      return 3 + extraFactor;
    }
  }

  public int calculatorPrice(int km, int type) {
    if (type == BUS) {
      return busPrice(km);
    } else if (type == TAIX) {
      return taxiPrice(km);
    } else if (type == SUBWAY) {
      return subPrice(km);
    }
    return -1;
  }
}
