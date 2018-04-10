package com.example.jc.myapplication.factory;

/**
 * @author jc
 * @time 2018/3/27 下午7:11
 * @desc 简单工厂模式测试类
 */

public class Test {
    public static void main(String[] args) {
        ImageFactory factory = new ImageReaderFactory();

        factory.getImage(GifImage.class).show();

        factory.getImage(PngImage.class).show();

        factory.getImage(PdfImage.class).show();
    }
}
