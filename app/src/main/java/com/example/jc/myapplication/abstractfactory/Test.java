package com.example.jc.myapplication.abstractfactory;

/**
 * @author jc
 * @time 2018/3/26 上午10:04
 * @desc 抽象工厂模式测试类
 */

public class Test {
  public static void main(String[] args) {
    EFactory factory = new TCLFactory();
    Television tv = factory.produceTelevision();
    tv.play();
    AirConditioner ac = factory.produceAirConditioner();
    ac.changeTemperature();

  }

}
