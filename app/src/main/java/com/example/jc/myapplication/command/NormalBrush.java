package com.example.jc.myapplication.command;

import android.graphics.Path;

/**
 * @author jc
 * @time 2018/4/9 下午11:00
 * @desc 普通线条 具体接收者
 */

public class NormalBrush implements IBrush {
    @Override
    public void down(Path path, float x, float y) {
        path.moveTo(x, y);
    }

    @Override
    public void move(Path path, float x, float y) {
        path.lineTo(x, y);
    }

    @Override
    public void up(Path path, float x, float y) {

    }
}
