package com.example.jc.myapplication.command;

import android.graphics.Canvas;

/**
 * @author jc
 * @time 2018/4/9 下午11:03
 * @desc 抽象命令类
 */

public interface IDraw {

    /**
     * 绘制命令
     *
     * @param canvas 画笔对象
     */
    void draw(Canvas canvas);

    /**
     * 撤销命令
     */
    void undo();
}
