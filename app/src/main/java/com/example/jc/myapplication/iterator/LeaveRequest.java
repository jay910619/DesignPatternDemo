package com.example.jc.myapplication.iterator;

/**
 * @author jc
 * @time 2018/4/2 下午9:31
 * @desc
 */

public class LeaveRequest {

  private String name;
  private int day;

  public LeaveRequest(String name, int day) {
    this.name = name;
    this.day = day;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getDay() {
    return day;
  }

  public void setDay(int day) {
    this.day = day;
  }

}
