package com.example.jc.myapplication.mediator;

/**
 * @author jc
 * @time 2018/5/5 下午6:35
 * @desc CPU
 */

public class CPU extends Colleague {

    private String dataVideo, dataSound;

    public CPU(Mediator mediator) {
        super(mediator);
    }

    public String getDataVideo() {
        return dataVideo;
    }

    public String getDataSound() {
        return dataSound;
    }

    public void decodeData(String data) {
        String[] tmp = data.split(",");

        dataVideo = tmp[0];

        dataSound = tmp[1];

        mediator.change(this);
    }
}
