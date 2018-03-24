package com.example.jc.myapplication.imageloader;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import android.widget.ImageView;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author jc
 * @time 2018/3/23 下午5:04
 * @desc 图片加载类 练习
 */

public class ImageLoader {
  ImageCache mImageCache = new ImageCache();

  /**
   * 线程池数量为CPU数量
   */

  ExecutorService mExecutorService =
      Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

  //ScheduledExecutorService mScheduledExecutorService =
  //    new ScheduledThreadPoolExecutor(Runtime.getRuntime().availableProcessors(),new BasicThreadFactory.);

  Handler mUiHandler = new Handler(Looper.getMainLooper());

  public void displayImage(final String url, final ImageView imageView) {
    imageView.setTag(url);
    mExecutorService.submit(new Runnable() {
      @Override public void run() {
        Bitmap bitmap = downloadImage(url);
        if (bitmap == null) {
          return;
        }
        if (imageView.getTag().equals(url)) {
          updateImageView(imageView, bitmap);
        }
        mImageCache.put(url, bitmap);
      }
    });
  }

  private void updateImageView(final ImageView imageView, final Bitmap bitmap) {
    mUiHandler.post(new Runnable() {
      @Override public void run() {
        imageView.setImageBitmap(bitmap);
      }
    });
  }

  private Bitmap downloadImage(String imageUrl) {
    Bitmap bitmap = null;
    try {
      URL url = new URL(imageUrl);
      HttpURLConnection connection = (HttpURLConnection) url.openConnection();
      bitmap = BitmapFactory.decodeStream(connection.getInputStream());
      connection.disconnect();
    } catch (MalformedURLException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return bitmap;
  }
}
