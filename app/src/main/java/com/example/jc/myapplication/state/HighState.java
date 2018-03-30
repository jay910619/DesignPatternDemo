package com.example.jc.myapplication.state;

/**
 * @author jc
 * @time 2018/3/30 下午1:16
 * @desc
 */

public class HighState implements State {
  int point;
  ForumAccount mAccount;

  public HighState(ForumAccount account) {
    account.setStateName("宗师");
    this.point = account.getPoint();
    this.mAccount = account;
  }

  @Override public void downLoadFile(int score) {
    System.out.println(mAccount.getName() + "下载文件，扣除" + score + "一半的积分");
    this.point -= score / 2;
    checkState(score / 2);
    System.out.println("剩余积分为" + point + "，当前等级为" + mAccount.getStateName());
  }

  @Override public void posted(int score) {
    System.out.println(mAccount.getName() + "发布新帖，增加" + score + "*2 积分");
    this.point += score * 2;
    checkState(score);
    System.out.println("剩余积分为" + mAccount.getPoint() + ", 当前级别为" + mAccount.getStateName());
  }

  @Override public void reply(int score) {
    System.out.println(mAccount.getName() + "发布留言，增加" + score + " 积分");
    this.point += score;
    checkState(score);
    System.out.println("剩余积分为" + mAccount.getPoint() + ", 当前级别为" + mAccount.getStateName());
  }

  @Override public void checkState(int score) {
    mAccount.setPoint(point);
    if (point < 0) {
      System.out.println("积分不足，下载文件失败！");
      this.point += score;
      mAccount.setPoint(point);
    } else if (point < 100) {
      mAccount.setState(new PrimaryState(mAccount));
    } else if (point < 1000) {
      mAccount.setState(new MiddleState(mAccount));
    }
  }
}
