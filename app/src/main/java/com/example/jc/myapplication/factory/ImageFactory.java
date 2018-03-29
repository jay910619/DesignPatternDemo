package com.example.jc.myapplication.factory;

/**
 * @author jc
 * @time 2018/3/27 下午6:43
 * @desc
 */

public abstract class ImageFactory {

  abstract <T extends Image> T getImage(Class<T> clz);
}
