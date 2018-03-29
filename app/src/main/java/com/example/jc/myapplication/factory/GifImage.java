package com.example.jc.myapplication.factory;

/**
 * @author jc
 * @time 2018/3/27 下午7:09
 * @desc
 */

public class GifImage extends Image {
  @Override void show() {
    System.out.println(this.toString() + " 展示 GIF 图片");
  }
}
