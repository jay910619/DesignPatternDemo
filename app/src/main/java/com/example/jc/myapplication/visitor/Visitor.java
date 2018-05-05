package com.example.jc.myapplication.visitor;

/**
 * @author jc
 * @time 2018/5/1 下午7:52
 * @desc
 */

public interface Visitor {

    void visit(Engineer engineer);

    void visit(Manager manager);
}
