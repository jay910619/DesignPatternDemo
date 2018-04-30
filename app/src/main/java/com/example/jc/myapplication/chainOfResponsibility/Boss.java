package com.example.jc.myapplication.chainOfResponsibility;

/**
 * @author jc
 * @time 2018/4/2 下午9:41
 * @desc 老板
 */

public class Boss extends Leader {

  private String name;

  public Boss(String name) {
    this.name = name;
  }

  @Override
  protected void handle(LeaveRequest request) {
    System.out.println(name + "审批员工 " + request.getName() + " 的请假条，请假天数为" + request.getDay() + "天");
  }

  @Override
  public int limit() {
    return Integer.MAX_VALUE;
  }
}
