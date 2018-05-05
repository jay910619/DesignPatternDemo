package com.example.jc.myapplication.visitor;

import java.util.Random;

/**
 * @author jc
 * @time 2018/5/1 下午7:51
 * @desc 员工基类
 */

public abstract class Staff {

    public String name;

    public int kpi;

    public Staff(String name) {
        this.name = name;
        kpi = new Random().nextInt(10);
    }

    public abstract void accept(Visitor visitor);
}
