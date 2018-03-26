package com.example.jc.myapplication.abstractfactory;

import android.util.Log;

/**
 * Created by jc on 2017/7/3.
 */

public class HaierTelevision implements Television {
    @Override
    public void play() {
        Log.v("111", "海尔电视play");
    }
}
