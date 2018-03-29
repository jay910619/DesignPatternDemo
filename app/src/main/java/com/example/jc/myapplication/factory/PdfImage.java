package com.example.jc.myapplication.factory;

/**
 * @author jc
 * @time 2018/3/27 下午7:08
 * @desc
 */

public class PdfImage extends Image {
  @Override void show() {
    System.out.println(this.toString() +" 展示 PDF 图片");
  }
}
