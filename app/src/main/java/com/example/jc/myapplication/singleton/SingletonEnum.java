package com.example.jc.myapplication.singleton;

/**
 * @author jc
 * @time 2018/3/24 下午12:09
 * @desc 枚举实现
 */

public enum SingletonEnum {
  INSTANCE;

  private String tagName;
  public void setTag(String tagName) {
    this.tagName = tagName;
  }

  public String getTag() {
    return tagName;
  }

  @Override public String toString() {
    return "SingletonEnum{" + "tagName='" + tagName + '\'' + '}';
  }
}
