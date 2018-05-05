package com.example.jc.myapplication.mediator;

/**
 * @author jc
 * @time 2018/5/5 下午6:38
 * @desc 声卡类
 */

public class SoundCard extends Colleague {
    public SoundCard(Mediator mediator) {
        super(mediator);
    }

    public void soundPlay(String data){
        System.out.println("音频：" + data);
    }
}
