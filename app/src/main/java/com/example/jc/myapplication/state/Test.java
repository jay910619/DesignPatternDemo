package com.example.jc.myapplication.state;

/**
 * @author jc
 * @time 2018/3/30 下午1:45
 * @desc
 */

public class Test {
  public static void main(String[] args) {
    ForumAccount account = new ForumAccount("杨过");
    account.downLoadFile(10);
    account.posted(20);
    account.downLoadFile(3);
    account.reply(33);
    account.posted(80);
    account.downLoadFile(3);
    account.downLoadFile(1700);
    account.reply(10);
    account.posted(10);
    account.downLoadFile(7);
    account.posted(700);
    account.reply(50);
    account.downLoadFile(200);
    account.downLoadFile(2000);
  }
}
