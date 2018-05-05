package com.example.jc.myapplication.mediator;

/**
 * @author jc
 * @time 2018/5/5 下午6:37
 * @desc 显卡类
 */

public class GraphicsCard extends Colleague {
    public GraphicsCard(Mediator mediator) {
        super(mediator);
    }

    public void videoPlay(String data) {
        System.out.println("视频：" + data);
    }
}
