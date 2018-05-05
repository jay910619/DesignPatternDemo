package com.example.jc.myapplication.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * @author jc
 * @time 2018/5/1 下午8:11
 * @desc 员工业务报表
 */

public class BusinessReport {

    List<Staff> mStaff = new LinkedList<>();

    public BusinessReport() {
        mStaff.add(new Manager("王经理"));
        mStaff.add(new Engineer("工程师-Shawn.Xiong"));
        mStaff.add(new Engineer("工程师-Kael"));
        mStaff.add(new Engineer("工程师-Jack"));
        mStaff.add(new Engineer("工程师-Rose"));
    }

    /**
     * 为访问者展示报表
     * @param visitor
     */
    public void showReport(Visitor visitor) {
        for (Staff staff : mStaff) {
            staff.accept(visitor);
        }
    }
}
