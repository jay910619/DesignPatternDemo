package com.example.jc.myapplication.mediator;

/**
 * @author jc
 * @time 2018/5/5 下午6:30
 * @desc 抽象同事
 */

public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
