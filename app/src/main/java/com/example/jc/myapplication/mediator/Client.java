package com.example.jc.myapplication.mediator;

/**
 * @author jc
 * @time 2018/5/5 下午6:45
 * @desc
 */

public class Client {

    public static void main(String[] args) {

        //构造主板
        MainBoard mainBoard = new MainBoard();

        // 构造零件
        CDDevice cd = new CDDevice(mainBoard);
        CPU cpu = new CPU(mainBoard);
        GraphicsCard gc = new GraphicsCard(mainBoard);
        SoundCard sc = new SoundCard(mainBoard);

        //零件安装到主板
        mainBoard.setCdDevice(cd);
        mainBoard.setCpu(cpu);
        mainBoard.setGraphicsCard(gc);
        mainBoard.setSoundCard(sc);

        //播放
        cd.load();
    }
}
