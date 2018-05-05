package com.example.jc.myapplication.mediator;

/**
 * @author jc
 * @time 2018/5/5 下午6:32
 * @desc 主板中介者
 */

public class MainBoard extends Mediator {

    private CDDevice cdDevice;
    private CPU cpu;
    private SoundCard soundCard;
    private GraphicsCard graphicsCard;

    @Override
    public void change(Colleague c) {
        if (c == cdDevice) {
            handleCD((CDDevice) c);
        } else if (c == cpu) {
            handleCPU((CPU) c);
        }
    }

    private void handleCD(CDDevice cdDevice) {
        cpu.decodeData(cdDevice.read());
    }

    private void handleCPU(CPU cpu) {
        soundCard.soundPlay(cpu.getDataSound());
        graphicsCard.videoPlay(cpu.getDataVideo());
    }


    public void setCdDevice(CDDevice cdDevice) {
        this.cdDevice = cdDevice;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setSoundCard(SoundCard soundCard) {
        this.soundCard = soundCard;
    }

    public void setGraphicsCard(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
    }
}
