package com.example.jc.myapplication.state.simple;

import android.content.Context;

/**
 * @author jc
 * @time 2018/3/30 下午3:32
 * @desc
 */

public class LoginContext {
  private UserState mState = new LogoutState();

  static LoginContext sLoginContext = new LoginContext();

  private LoginContext() {
  }

  public static LoginContext getLoginContext() {
    return sLoginContext;
  }

  public void setState(UserState state) {
    mState = state;
  }

  public void forward(Context context) {
    mState.forward(context);
  }

  public void comment(Context context) {
    mState.comment(context);
  }
}
