package com.example.jc.myapplication.imageloader;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.LruCache;

/**
 * @author jc
 * @time 2018/3/23 下午6:32
 * @desc
 */

public class ImageCache {

  LruCache<String, Bitmap> mImageCache;

  public ImageCache() {
    initImageCache();
  }

  private void initImageCache() {
    //
    int maxMemory = (int) (Runtime.getRuntime().maxMemory() / 1024);

    int cacheSize = maxMemory / 4;

    mImageCache = new LruCache<String, Bitmap>(cacheSize) {
      @Override protected int sizeOf(String key, Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
          return bitmap.getAllocationByteCount();
        }
        return bitmap.getByteCount();
        //return bitmap.getRowBytes() * bitmap.getHeight() / 1024;
      }
    };
  }

  public void put(String url, Bitmap bitmap) {
    mImageCache.put(url, bitmap);
  }

  public Bitmap get(String url) {
    return mImageCache.get(url);
  }
}
