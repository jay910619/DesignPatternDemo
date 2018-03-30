package com.example.jc.myapplication.state;

/**
 * @author jc
 * @time 2018/3/30 下午3:27
 * @desc
 */

public interface State {

  /**
   * 下载
   *
   * @param score 下载需要消耗的积分
   */
  void downLoadFile(int score);

  /**
   * 发帖
   *
   * @param score 发帖获得的奖励积分
   */
  void posted(int score);

  /**
   * 回复留言
   *
   * @param score 回帖的奖励积分
   */
  void reply(int score);

  /**
   * 判断当前状态
   *
   * @param score 执行某个操作涉及到的积分
   */
  void checkState(int score);
}
