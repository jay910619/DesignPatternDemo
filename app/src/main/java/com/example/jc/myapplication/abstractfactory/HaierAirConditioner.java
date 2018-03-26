package com.example.jc.myapplication.abstractfactory;

import android.util.Log;

/**
 * Created by jc on 2017/7/3.
 */

public class HaierAirConditioner implements AirConditioner {
    @Override
    public void changeTemperature() {
      System.out.print( " 海尔空调改调温");
    }
}
