package com.example.jc.myapplication.factory;

/**
 * @author jc
 * @time 2018/3/27 下午7:10
 * @desc
 */

public class PngImage extends Image {
    @Override
    void show() {
        System.out.println(this.toString() + " 展示 PNG 图片");
    }
}
