package com.example.jc.myapplication.iterator;

/**
 * @author jc
 * @time 2018/4/2 下午9:41
 * @desc 部门主管
 */

public class GeneralManager extends Leader {

  private String name;

  public GeneralManager(String name) {
    this.name = name;
  }

  @Override protected void handle(LeaveRequest request) {
      System.out.println(
          "总经理" + name + "审批员工" + request.getName() + " 的请假条，请假天数为" + request.getDay() + "天");
  }

  @Override public int limit() {
    return 15;
  }
}
