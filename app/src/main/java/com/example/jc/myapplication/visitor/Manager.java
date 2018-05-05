package com.example.jc.myapplication.visitor;

import java.util.Random;

/**
 * @author jc
 * @time 2018/5/1 下午7:54
 * @desc 经理
 */

public class Manager extends Staff {
    private int products;

    public Manager(String name) {
        super(name);
        products = new Random().nextInt(10);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getProducts() {
        return products;
    }
}
