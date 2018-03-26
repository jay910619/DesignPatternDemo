package com.example.jc.myapplication.utils;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;

/**
 * Created by jc on 2017/7/10.
 */

public class Mtoast extends Toast {

  private static Mtoast mtoast;

  private Mtoast(Context context) {
    super(context);
  }

  public static Mtoast getInstance(Context context) {
    if (mtoast == null) {
      synchronized (Mtoast.class) {
        if (mtoast == null) {
          mtoast = new Mtoast(context.getApplicationContext());
        }
      }
    }
    return mtoast;
  }

  public void shortToast(CharSequence content) {
    if (TextUtils.isEmpty(content)) {
      return;
    }
    mtoast.setText(content);
    //设置显示时间
    mtoast.setDuration(Toast.LENGTH_SHORT);
    mtoast.show();
  }
}
