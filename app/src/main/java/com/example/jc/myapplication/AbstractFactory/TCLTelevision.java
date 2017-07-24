package com.example.jc.myapplication.AbstractFactory;

import android.util.Log;

/**
 * Created by jc on 2017/7/3.
 */

public class TCLTelevision implements Television {
    @Override
    public void play() {
        Log.v("111", " TCL电视play");
    }
}
