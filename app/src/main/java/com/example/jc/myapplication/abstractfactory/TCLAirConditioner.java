package com.example.jc.myapplication.abstractfactory;


/**
 * Created by jc on 2017/7/3.
 */

public class TCLAirConditioner implements AirConditioner {
    @Override
    public void changeTemperature() {
        System.out.print(" TCL空调改调温");
    }
}
