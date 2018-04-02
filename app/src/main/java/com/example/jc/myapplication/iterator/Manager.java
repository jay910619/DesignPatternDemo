package com.example.jc.myapplication.iterator;

/**
 * @author jc
 * @time 2018/4/2 下午9:41
 * @desc 经理类
 */

public class Manager extends Leader {

  private String name;

  public Manager(String name) {
    this.name = name;
  }

  @Override protected void handle(LeaveRequest request) {
    System.out.println(
        "经理" + name + "审批员工" + request.getName() + " 的请假条，请假天数为" + request.getDay() + "天");
  }

  @Override public int limit() {
    return 10;
  }
}
