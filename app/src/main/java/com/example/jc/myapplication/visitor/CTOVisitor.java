package com.example.jc.myapplication.visitor;

/**
 * @author jc
 * @time 2018/5/1 下午8:17
 * @desc CTO访问者，关心技术贡献
 */

public class CTOVisitor implements Visitor {
    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师 ：" + engineer.name + " , 代码行数" + engineer.getCodeLines());
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("经理 ：" + manager.name + " ,新产品数量 ：" + manager.getProducts());
    }
}
