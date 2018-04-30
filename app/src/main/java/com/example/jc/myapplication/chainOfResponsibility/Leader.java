package com.example.jc.myapplication.chainOfResponsibility;

/**
 * @author jc
 * @time 2018/4/2 下午9:29
 * @desc
 */

public abstract class Leader {

  /**
   * 下一节点上的处理者对象
   */
  protected Leader nextHandler;

  /**
   * 处理请求
   *
   * @param request 请求对象
   */
  public final void handlerRequest(LeaveRequest request) {
    if (request.getDay() <= limit()) {
      handle(request);
    } else {
      if (null != nextHandler) {
        nextHandler.handlerRequest(request);
      }
    }
  }

  /**
   * 请求处理
   *
   * @param request 请求条件
   */
  protected abstract void handle(LeaveRequest request);

  /**
   * 有权审批的最大天数
   *
   * @return 最大天数
   */
  public abstract int limit();
}
