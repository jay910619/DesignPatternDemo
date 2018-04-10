package com.example.jc.myapplication.factory;

/**
 * @author jc
 * @time 2018/3/27 下午7:03
 * @desc
 */

public class ImageReaderFactory extends ImageFactory {
    @Override
    <T extends Image> T getImage(Class<T> clz) {
        Image image = null;
        try {
            image = (Image) Class.forName(clz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) image;
    }
}
