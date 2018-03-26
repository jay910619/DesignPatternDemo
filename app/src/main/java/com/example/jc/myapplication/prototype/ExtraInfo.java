package com.example.jc.myapplication.prototype;

import java.util.List;

/**
 * @author jc
 * @time 2018/3/26 下午9:34
 * @desc
 */

public class ExtraInfo {

  private int sex;
  private String signature;
  private List<String> label;

  public ExtraInfo(int sex, String signature, List<String> label) {
    this.sex = sex;
    this.signature = signature;
    this.label = label;
  }

  public int getSex() {
    return sex;
  }

  public void setSex(int sex) {
    this.sex = sex;
  }

  public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }

  public List<String> getLabel() {
    return label;
  }

  public void setLabel(List<String> label) {
    this.label = label;
  }

  @Override public String toString() {
    return "ExtraInfo{"
        + "sex="
        + sex
        + ", signature='"
        + signature
        + '\''
        + ", label='"
        + label
        + '\''
        + '}';
  }
}
