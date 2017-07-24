package com.example.jc.myapplication.AbstractFactory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.jc.myapplication.AbstractFactory.AirConditioner;
import com.example.jc.myapplication.AbstractFactory.EFactory;
import com.example.jc.myapplication.AbstractFactory.TCLFactory;
import com.example.jc.myapplication.AbstractFactory.Television;
import com.example.jc.myapplication.R;


/*抽象工程模式
* 隔离了具体类的生成 保证产品族对象的一致性  方便增加新的具体工厂和产品族
* 难以拓展抽象工厂来添加新的产品对象*/
public class AbstractFactoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abstract_factory);

//        /*如何通过str 反射生成对应类*/
//        String str="TCLFactory";

        EFactory factory = new TCLFactory();

        Television tv = factory.produceTelevision();
        tv.play();
        AirConditioner ac = factory.produceAirConditioner();
        ac.changeTemperature();

    }


}
