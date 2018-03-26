package com.example.jc.myapplication.abstractfactory;

/**
 * Created by jc on 2017/7/3.
 */

public class TCLFactory implements EFactory {
    @Override
    public Television produceTelevision() {
        return new TCLTelevision();
    }

    @Override
    public AirConditioner produceAirConditioner() {
        return new TCLAirConditioner();
    }
}
