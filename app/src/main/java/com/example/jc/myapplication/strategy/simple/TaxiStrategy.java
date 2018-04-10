package com.example.jc.myapplication.strategy.simple;

/**
 * @author jc
 * @time 2018/3/29 下午5:47
 * @desc
 */

public class TaxiStrategy implements CalculateStrategy {
    @Override
    public int calculatePrice(int km) {
        if (km < 10) {
            return 12;
        } else {
            return 16 + (km - 10) * 2;
        }
    }
}
