package com.example.jc.myapplication.visitor;

/**
 * @author jc
 * @time 2018/5/1 下午8:21
 * @desc
 */

public class Client {
    public static void main(String[] args) {
        BusinessReport report = new BusinessReport();

        System.out.println("---------- 给 CEO 看的报表 -------------");

        report.showReport(new CEOVisitor());

        System.out.println("\n---------- 给 CTO 看的报表 -------------");

        report.showReport(new CTOVisitor());
    }
}
