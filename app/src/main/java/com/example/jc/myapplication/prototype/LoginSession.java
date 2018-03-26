package com.example.jc.myapplication.prototype;

/**
 * @author jc
 * @time 2018/3/26 下午9:52
 * @desc
 */

public class LoginSession {

  private static LoginSession sLoginSession = new LoginSession();

  private User mUser;

  private LoginSession() {
  }

  public static LoginSession getInstance() {
    return sLoginSession;
  }

  public User getLoginUser() {
    return mUser.clone();
  }

  //public User getLoginUser() {
  //  return mUser;
  //}


  public void setLoginUser(User user) {
    mUser = user;
  }
}
