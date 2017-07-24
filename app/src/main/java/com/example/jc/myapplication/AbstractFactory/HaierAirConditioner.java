package com.example.jc.myapplication.AbstractFactory;

import android.util.Log;

/**
 * Created by jc on 2017/7/3.
 */

public class HaierAirConditioner implements AirConditioner {
    @Override
    public void changeTemperature() {
        Log.v("111", " 海尔空调改调温");
    }
}
