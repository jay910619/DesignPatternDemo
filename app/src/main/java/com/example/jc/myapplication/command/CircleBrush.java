package com.example.jc.myapplication.command;

import android.graphics.Path;

/**
 * @author jc
 * @time 2018/4/9 下午11:01
 * @desc 圆点线条
 */

public class CircleBrush implements IBrush {
  @Override public void down(Path path, float x, float y) {

  }

  @Override public void move(Path path, float x, float y) {
    path.addCircle(x, y, 10, Path.Direction.CW);
  }

  @Override public void up(Path path, float x, float y) {

  }
}
