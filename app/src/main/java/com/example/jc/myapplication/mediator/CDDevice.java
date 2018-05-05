package com.example.jc.myapplication.mediator;

/**
 * @author jc
 * @time 2018/5/5 下午6:33
 * @desc CD设备
 */

public class CDDevice extends Colleague {

    private String data;

    public CDDevice(Mediator mediator) {
        super(mediator);
    }

    public String read() {
        return data;
    }

    public void load() {
        data = "视频,音频数据流";
        mediator.change(this);
    }
}
