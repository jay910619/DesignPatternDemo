package com.example.jc.myapplication.state;

/**
 * @author jc
 * @time 2018/3/30 下午3:27
 * @desc
 */

public class ForumAccount {

  private volatile int mPoint;
  private String userName;
  private State mState;
  private String stateName;

  public ForumAccount(String name) {
    this.userName = name;
    mState = new PrimaryState(this);
  }

  public void setState(State state) {
    mState = state;
  }

  public void downLoadFile(int score) {
    mState.downLoadFile(score);
  }

  public void posted(int score) {
    mState.posted(score);
  }

  public void reply(int score) {
    mState.reply(score);
  }

  /**
   * 获得当前积分
   */
  public int getPoint() {
    return mPoint;
  }

  public void setPoint(int point) {
    mPoint = point;
  }

  public String getName() {
    return userName;
  }

  public String getStateName() {
    return stateName;
  }

  public void setStateName(String stateName) {
    this.stateName = stateName;
  }
}
