package com.example.jc.myapplication.strategy.simple;

/**
 * @author jc
 * @time 2018/3/29 下午5:49
 * @desc
 */

public class Test {
    public static void main(String[] args) {
        TrafficCalculator calculator = new TrafficCalculator();
        calculator.setStrategy(new TaxiStrategy());
        calculator.calculatePrice(20);
    }
}
