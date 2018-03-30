package com.example.jc.myapplication.state.simple;

import android.content.Context;
import android.widget.Toast;

/**
 * @author jc
 * @time 2018/3/30 下午3:33
 * @desc
 */

public class LoginState implements UserState {
  @Override public void forward(Context context) {
    Toast.makeText(context, "转发", Toast.LENGTH_SHORT).show();
  }

  @Override public void comment(Context context) {
    Toast.makeText(context, "评论", Toast.LENGTH_SHORT).show();
  }
}
