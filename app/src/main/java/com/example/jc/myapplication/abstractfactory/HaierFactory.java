package com.example.jc.myapplication.abstractfactory;

/**
 * Created by jc on 2017/7/3.
 */

public class HaierFactory implements EFactory {
    @Override
    public Television produceTelevision() {
        return new HaierTelevision();
    }

    @Override
    public AirConditioner produceAirConditioner() {
        return new HaierAirConditioner();
    }
}
