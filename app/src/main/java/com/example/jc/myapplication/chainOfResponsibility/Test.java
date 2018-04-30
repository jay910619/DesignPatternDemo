package com.example.jc.myapplication.chainOfResponsibility;

/**
 * @author jc
 * @time 2018/4/2 下午9:26
 * @desc 责任链模式
 */

public class Test {

    public static void main(String[] args) {

        // 处理者对象
        Leader handler1 = new TeamLeader("沙僧");
        Leader handler2 = new Manager("八戒");
        Leader handler3 = new Director("悟空");
        Leader handler4 = new Boss(" 唐僧");

        //  请求者对象
        LeaveRequest request1 = new LeaveRequest("张三", 2);
        LeaveRequest request2 = new LeaveRequest("李四", 5);
        LeaveRequest request3 = new LeaveRequest("王五", 11);
        LeaveRequest request4 = new LeaveRequest("赵六", 18);
        LeaveRequest request5 = new LeaveRequest("赵六", 30);

        //设置责任节点链
        handler1.nextHandler = handler2;
        handler2.nextHandler = handler3;
        handler3.nextHandler = handler4;

        System.out.println("---------request1---------------");
        handler1.handlerRequest(request1);

        System.out.println("----------request2--------------");
        handler1.handlerRequest(request2);

        System.out.println("-----------request3-------------");
        handler1.handlerRequest(request3);

        System.out.println("-----------request4-------------");
        handler1.handlerRequest(request4);

        System.out.println("-----------request5-------------");
        handler1.handlerRequest(request5);

        System.out.println("-----------request1-------------");
        handler3.handlerRequest(request1);

        System.out.println("-----------request4-------------");
        handler3.handlerRequest(request4);
    }
}
