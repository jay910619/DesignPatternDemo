package com.example.jc.myapplication.command;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

/**
 * @author jc
 * @time 2018/4/9 下午11:04
 * @desc 绘制路径的方法
 */

public class DrawPath implements IDraw {

  public Path path;
  public Paint paint;

  @Override public void draw(Canvas canvas) {
    canvas.drawPath(path, paint);
  }

  @Override public void undo() {

  }
}
