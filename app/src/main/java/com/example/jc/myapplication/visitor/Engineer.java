package com.example.jc.myapplication.visitor;

import java.util.Random;

/**
 * @author jc
 * @time 2018/5/1 下午7:53
 * @desc 工程师
 */

public class Engineer extends Staff {


    public Engineer(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }


    /**
     * @return 工程师这一年的代码数量
     */
    public int getCodeLines() {
        return new Random().nextInt(10 * 10000);
    }

}
