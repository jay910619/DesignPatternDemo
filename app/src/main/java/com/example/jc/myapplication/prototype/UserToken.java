package com.example.jc.myapplication.prototype;

/**
 * @author jc
 * @time 2018/3/26 下午9:36
 * @desc
 */

public class UserToken {
  private String token;
  private String session;
  /**
   * token过期时间
   */
  private int deadTime;

  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public String getSession() {
    return session;
  }

  public void setSession(String session) {
    this.session = session;
  }

  public int getDeadTime() {
    return deadTime;
  }

  public void setDeadTime(int deadTime) {
    this.deadTime = deadTime;
  }

  @Override public String toString() {
    return "UserToken{"
        + "token='"
        + token
        + '\''
        + ", session='"
        + session
        + '\''
        + ", deadTime="
        + deadTime
        + '}';
  }
}
