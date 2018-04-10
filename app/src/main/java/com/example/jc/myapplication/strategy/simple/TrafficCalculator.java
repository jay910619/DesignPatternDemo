package com.example.jc.myapplication.strategy.simple;

/**
 * @author jc
 * @time 2018/3/29 下午5:47
 * @desc
 */

public class TrafficCalculator {

    CalculateStrategy mStrategy;

    public void setStrategy(CalculateStrategy strategy) {
        mStrategy = strategy;
    }

    public int calculatePrice(int km) {
        return mStrategy.calculatePrice(km);
    }
}
